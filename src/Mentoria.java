public class Mentoria {
    private String titulo;
    private int duracao;

    public Mentoria(String titulo, int duracao) {
        this.titulo = titulo;
        this.duracao = duracao;
    }

    public String getTitulo() {
        return titulo;
    }

    public int getXp() {
        return duracao * 15; // exemplo de cálculo de XP
    }
}
