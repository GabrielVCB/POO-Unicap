public class Lutador {
    String nome;
    int energia;
    int forca;

    public Lutador(String nome, int energia, int forca) {
        this.nome = nome;
        this.energia = energia;
        this.forca = forca;
    }

    public void reduzirEnergia(int quantidade) {
        this.energia -= quantidade;
        if (this.energia < 0) {
            this.energia = 0;
        }
    }

    public void aplicarGolpe(Lutador outroLutador) {
        outroLutador.reduzirEnergia(this.forca);
    }
}
