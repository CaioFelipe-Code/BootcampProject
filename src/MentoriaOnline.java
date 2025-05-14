public class MentoriaOnline extends Mentoria {
    private String url;

    public MentoriaOnline(String tema, int data, String url) {
        super(tema, data); // Chama o construtor da classe pai (Mentoria)
        this.url = url;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    @Override
    public String toString() {
        return super.toString() + " (Online, Acesse em: " + url + ")";
    }
}
