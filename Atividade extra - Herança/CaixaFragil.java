public class CaixaFragil extends Caixa {
    private double pesoMaxSuportado;

    public CaixaFragil(int id, String conteudo, double peso, double altura, double pesoMaxSuportado) {
        super(id, conteudo, peso, altura);
        this.pesoMaxSuportado = pesoMaxSuportado;
    }

    public double getPesoMaxSuportado() {
        return pesoMaxSuportado;
    }

    public void setPesoMaxSuportado(double pesoMaxSuportado) {
        this.pesoMaxSuportado = pesoMaxSuportado;
    }

    @Override
    public void exibirEtiqueta() {
        System.out.println("Peso máximo suportado: " + pesoMaxSuportado);
    }

}
