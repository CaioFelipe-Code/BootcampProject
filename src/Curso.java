public class Curso {
    private String titulo;
    private int cargaHoraria;

    public Curso(String titulo, int cargaHoraria) {
        this.titulo = titulo;
        this.cargaHoraria = cargaHoraria;
    }

    public String getTitulo() {
        return titulo;
    }

    public int getXp() {
        return cargaHoraria * 10; // exemplo de cálculo de XP
    }
}
