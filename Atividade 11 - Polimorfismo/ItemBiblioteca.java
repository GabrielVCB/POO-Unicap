import java.time.LocalDate;
public abstract class ItemBiblioteca {
    private String titulo;
    private int anoPubli;
    private int copDisponiveis;

    public abstract void calcular_multa(LocalDate dataEmprestimo, LocalDate dataDevolucao, int prazoDevolucao);    
    public abstract void emprestimo();
    public abstract void devolucao();

    public String getTitulo() {
        return titulo;
    }
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
    public int getAnoPubli() {
        return anoPubli;
    }
    public void setAnoPubli(int anoPubli) {
        this.anoPubli = anoPubli;
    }
    public int getCopDisponiveis() {
        return copDisponiveis;
    }
    public void setCopDisponiveis(int copDisponiveis) {
        this.copDisponiveis = copDisponiveis;
    }
}
