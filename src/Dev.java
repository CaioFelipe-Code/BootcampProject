import java.util.ArrayList;
import java.util.List;

public class Dev {
    private String nome;
    private List<Curso> cursosInscritos = new ArrayList<>();
    private List<Mentoria> mentoriasInscritas = new ArrayList<>();
    private List<Double> progressoCursos = new ArrayList<>();
    private List<Double> progressoMentorias = new ArrayList<>();

    public Dev(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void inscreverEmCurso(Curso curso) {
        cursosInscritos.add(curso);
        progressoCursos.add(0.0); // Inicia o progresso do curso em 0%
    }

    public void inscreverEmMentoria(Mentoria mentoria) {
        mentoriasInscritas.add(mentoria);
        progressoMentorias.add(0.0); // Inicia o progresso da mentoria em 0%
    }

    public void mostrarProgresso() {
        System.out.println(nome + "'s Progresso:");
        for (int i = 0; i < cursosInscritos.size(); i++) {
            System.out.println(cursosInscritos.get(i).getNome() + " - Progresso: " + progressoCursos.get(i) + "%");
        }
        for (int i = 0; i < mentoriasInscritas.size(); i++) {
            System.out
                    .println(mentoriasInscritas.get(i).getTema() + " - Progresso: " + progressoMentorias.get(i) + "%");
        }
    }

    public void atualizarProgressoCurso(int index, double progresso) {
        if (index >= 0 && index < progressoCursos.size()) {
            progressoCursos.set(index, progresso);
        }
    }

    public void atualizarProgressoMentoria(int index, double progresso) {
        if (index >= 0 && index < progressoMentorias.size()) {
            progressoMentorias.set(index, progresso);
        }
    }
}
