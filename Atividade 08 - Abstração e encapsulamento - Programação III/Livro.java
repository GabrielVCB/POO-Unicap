//Questão 5
public class Livro {
    private String titulo;
    private String autor;
    private int anoPubli;
    
    public Livro(String titulo, String autor, int anoPubli) {
        this.titulo = titulo;
        this.autor = autor;
        this.anoPubli = anoPubli;
    }
    
    public void listar(String titulo) {
        System.out.printf("Livro pesquisado: %s\nAutor: %s\nAno de publicacao: %d\n",this.titulo,this.autor,this.anoPubli);
    }
}
