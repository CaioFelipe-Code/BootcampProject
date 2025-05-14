import java.time.LocalDate;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        // Criando cursos
        Curso cursoJava = new Curso("Java Developer", "Curso de Java para iniciantes");
        Curso cursoReact = new Curso("React Developer", "Curso de React para desenvolvedores web");

        // Criando mentorias
        Mentoria mentoriaJava = new Mentoria("Java no mercado", LocalDate.of(2023, 5, 20));
        Mentoria mentoriaReact = new Mentoria("React avançado", LocalDate.of(2023, 6, 15));

        // Criando um Dev
        Dev dev1 = new Dev("Caio");

        // Inscrevendo o Dev em cursos e mentorias
        dev1.inscreverEmCurso(cursoJava);
        dev1.inscreverEmCurso(cursoReact);
        dev1.inscreverEmMentoria(mentoriaJava);
        dev1.inscreverEmMentoria(mentoriaReact);

        // Mostrando progresso inicial
        dev1.mostrarProgresso();

        // Atualizando progresso
        dev1.atualizarProgressoCurso(0, 50.0); // Progresso de 50% no curso Java
        dev1.atualizarProgressoMentoria(1, 80.0); // Progresso de 80% na mentoria React

        // Mostrando progresso após atualizações
        dev1.mostrarProgresso();
    }
}
