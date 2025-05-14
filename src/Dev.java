import java.util.ArrayList;
import java.util.List;

public class Dev {
    private String nome;
    private List<Curso> cursosInscritos = new ArrayList<>();
    private List<Mentoria> mentoriasInscritas = new ArrayList<>();
    private int xpTotal;

    public Dev(String nome) {
        this.nome = nome;
    }

    public void inscreverEmCurso(Curso curso) {
        cursosInscritos.add(curso);
        System.out.println(nome + " se inscreveu no curso: " + curso.getTitulo());
    }

    public void concluirCurso(int index) {
        if (index >= 0 && index < cursosInscritos.size()) {
            Curso curso = cursosInscritos.remove(index);
            xpTotal += curso.getXp();
            System.out.println(nome + " concluiu o curso: " + curso.getTitulo());
        }
    }

    public void inscreverEmMentoria(Mentoria mentoria) {
        mentoriasInscritas.add(mentoria);
        System.out.println(nome + " se inscreveu na mentoria: " + mentoria.getTitulo());
    }

    public void concluirMentoria(int index) {
        if (index >= 0 && index < mentoriasInscritas.size()) {
            Mentoria mentoria = mentoriasInscritas.remove(index);
            xpTotal += mentoria.getXp();
            System.out.println(nome + " concluiu a mentoria: " + mentoria.getTitulo());
        }
    }

    public void mostrarStatus() {
        System.out.println("Nome: " + nome);
        System.out.println("XP Total: " + xpTotal);
        System.out.println("Cursos pendentes: " + cursosInscritos.size());
        System.out.println("Mentorias pendentes: " + mentoriasInscritas.size());
    }

    public String getNome() {
        return nome;
    }

    public int getXpTotal() {
        return xpTotal;
    }
}
