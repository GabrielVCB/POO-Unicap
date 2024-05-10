public class Circulo {
    private double raio;

    public Circulo(double raio) {
        this.raio = raio;
    }

    public double getRaio() {
        return raio;
    }

    public double calcularArea() {
        return Math.PI * Math.pow(raio, 2);
    }

    @Override
    public String toString() {
        return "Circulo [raio=" + raio + "]";
    }
}
