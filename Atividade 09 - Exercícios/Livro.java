public class Livro {
    private String titulo;
    private String autor;
    private boolean disponivel;

    public Livro(String titulo, String autor, boolean disponivel) {
        this.titulo = titulo;
        this.autor = autor;
        this.disponivel = disponivel;
    }

    public void verificarDisponibilidade() {
        if (this.disponivel == true) {
            System.out.println("Este livro está disponível.");
        } else {
            System.out.println("Este livro não está disponível.");
        }
    }
}
