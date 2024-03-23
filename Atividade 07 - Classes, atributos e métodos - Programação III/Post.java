public class Post {
    String texto;
    String link;
    int numCurtidas;
    int numCompartilhamentos = 0;

    public Post(String texto, String link) {
        this.texto = texto;
        this.link = link;
        this.numCurtidas = numCurtidas;
        this.numCompartilhamentos = numCompartilhamentos;
    }

    public void curtir(String texto) {
        this.numCurtidas++;
    }

    public void compartilhar(String link) {
        this.numCompartilhamentos++;
    }
}
