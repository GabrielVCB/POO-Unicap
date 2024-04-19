public abstract class Caixa {
    private int id;
    private String conteudo;
    private double peso;
    private double altura;
    
    public Caixa(int id, String conteudo, double peso, double altura) {
        this.id = id;
        this.conteudo = conteudo;
        this.peso = peso;
        this.altura = altura;
    }

    public abstract void exibirEtiqueta();
    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getConteudo() {
        return conteudo;
    }

    public void setConteudo(String conteudo) {
        this.conteudo = conteudo;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }
}
