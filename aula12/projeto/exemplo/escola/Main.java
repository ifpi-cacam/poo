package exemplo.escola;

public class Main {

    public static void main(String[] args) {

        Data dt1 = new Data(22, 10, 2025);
        // Entre Data e RegistroAcademico --> Agregação
        // Entre RegistroAcademico e Aluno --> Composição
        Aluno al1 = new Aluno("Maria", 22, dt1, 7.5);
        Aluno al2 = new Aluno("Maria", 30, dt1, 4.5);

        System.out.println("Data para os 2 rAs: " + dt1.getDia()+"/"+dt1.getMes()+"/"+dt1.getAno());
        System.out.println("Registro Academico do Aluno 1 (media): " + al1.getRa().getMediaGeral() );
        System.out.println("Registro Academico do Aluno 1 (data): " + al1.mostraData());
        System.out.println("Registro Academico do Aluno 2 (media): " + al2.getRa().getMediaGeral() );
        System.out.println("Registro Academico do Aluno 2 (data): " + al2.mostraData());

    }

}
