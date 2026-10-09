const WEB_APP_URL = "https://script.google.com/macros/s/AKfycbwYvNzyKorSGOvQWHknf-BVLfX5UqYin7OsZWRcpQ-pVAaUo-jSZ8xE1z4NegwqDspGQg/exec";
const MAX_FILE_SIZE_MB = 45;

const form = document.getElementById("trabalhoForm");
const submitBtn = document.getElementById("submitBtn");
const statusMessage = document.getElementById("statusMessage");

const alunoSelect = new TomSelect("#alunoSelect", {
    create: false,
    sortField: {
        field: "text",
        direction: "asc"
    },
    searchField: ["text"],
    placeholder: "Digite parte do nome ou da matricula..."
});

form.addEventListener("submit", async (event) => {
    event.preventDefault();
    clearStatus();

    if (!WEB_APP_URL || WEB_APP_URL.includes("COLE_AQUI") || !WEB_APP_URL.endsWith("/exec")) {
        setStatus("Configure a URL do Google Apps Script no arquivo script.js antes de publicar.", "error");
        return;
    }

    const alunoSelecionado = document.getElementById("alunoSelect").value;
    const fileInput = document.getElementById("arquivoZip");
    const arquivo = fileInput.files[0];

    if (!alunoSelecionado || !arquivo) {
        setStatus("Selecione seu nome na lista e escolha o arquivo ZIP.", "error");
        return;
    }

    const [matricula, nome] = alunoSelecionado.split("|");

    if (!arquivo.name.toLowerCase().endsWith(".zip")) {
        setStatus("O arquivo deve estar no formato .zip.", "error");
        fileInput.value = "";
        return;
    }

    if (arquivo.size > MAX_FILE_SIZE_MB * 1024 * 1024) {
        setStatus(`O arquivo deve ter no maximo ${MAX_FILE_SIZE_MB} MB.`, "error");
        return;
    }

    const confirmed = confirm("Confirma o envio do trabalho? Verifique se o ZIP contem todo o projeto.");
    if (!confirmed) return;

    submitBtn.disabled = true;
    submitBtn.textContent = "Enviando...";
    setStatus("Convertendo arquivo e enviando para o Drive...", "");

    try {
        const payload = {
            matricula,
            nome,
            horario: new Date().toLocaleString("pt-BR"),
            arquivoNome: arquivo.name,
            arquivoMimeType: arquivo.type || "application/zip",
            arquivoBase64: await fileToBase64(arquivo)
        };

        const result = await submitToAppsScript(payload, matricula, nome);

        if (!result.success) {
            throw new Error(result.message || "Nao foi possivel registrar o envio.");
        }

        setStatus(`Trabalho enviado com sucesso. Pasta criada: ${result.folderName}`, "success");
        form.reset();
        alunoSelect.clear();
    } catch (error) {
        console.error(error);
        setStatus(`Falha no envio: ${error.message}`, "error");
    } finally {
        submitBtn.disabled = false;
        submitBtn.textContent = "Enviar trabalho";
    }
});

function fileToBase64(file) {
    return new Promise((resolve, reject) => {
        const reader = new FileReader();

        reader.onload = () => {
            const result = String(reader.result);
            resolve(result.split(",")[1]);
        };

        reader.onerror = () => reject(new Error("Nao foi possivel ler o arquivo selecionado."));
        reader.readAsDataURL(file);
    });
}

async function submitToAppsScript(payload, matricula, nome) {
    const body = new URLSearchParams();
    body.append("payload", JSON.stringify(payload));

    await fetch(WEB_APP_URL, {
        method: "POST",
        mode: "no-cors",
        body
    });

    return {
        success: true,
        folderName: sanitizeFolderName(`${matricula}_${nome}`)
    };
}

function sanitizeFolderName(value) {
    return String(value || "")
        .trim()
        .replace(/[\\/:*?"<>|#%{}~&]/g, "-")
        .replace(/\s+/g, " ")
        .substring(0, 180);
}

function setStatus(message, type) {
    statusMessage.textContent = message;
    statusMessage.className = `status ${type}`.trim();
}

function clearStatus() {
    setStatus("", "");
}
