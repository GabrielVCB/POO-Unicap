//Questão 2
public class Carro {
    private String marca;
    private String modelo;
    private int anoFabricacao;
    private int velAtual;

    public Carro(String marca,String modelo,int anoFabricacao,int velAtual) {
        this.marca = marca;
        this.modelo = modelo;
        this.anoFabricacao = anoFabricacao;
        this.velAtual = velAtual;
    }

    public int getVelAtual() {
        return velAtual;
    }


    public void acelerar(int incremento) {
        if(incremento > 0) {
            this.velAtual += incremento;
        }
    }
    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }

    public int getAnoFabricacao() {
        return anoFabricacao;
    }
}
