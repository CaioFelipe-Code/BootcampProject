public class Main {
    public static void main(String[] args) {
        Dev dev1 = new Dev("Caio");
        Dev dev2 = new Dev("Ana");

        Curso cursoJava = new Curso("Java Básico", 8);
        Mentoria mentoriaJava = new Mentoria("Mentoria Java", 2);

        dev1.inscreverEmCurso(cursoJava);
        dev1.inscreverEmMentoria(mentoriaJava);

        dev1.concluirCurso(0);
        dev1.concluirMentoria(0);

        dev1.mostrarStatus();
        dev2.mostrarStatus();
    }
}
