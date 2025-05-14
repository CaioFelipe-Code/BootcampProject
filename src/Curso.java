import java.util.List;

public class Curso {
    private String nome;
    private String descricao;

    public Curso(String nome, String descricao) {
        this.nome = nome;
        this.descricao = descricao;
    }

    public String getNome() {
        return nome;
    }

    public String getDescricao() {
        return descricao;
    }
}
