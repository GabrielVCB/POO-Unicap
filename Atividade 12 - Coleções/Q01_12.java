public class Q01_12 {
    public static void main(String[] args) {
        Circulo c1 = new Circulo(5.0);
        Circulo c2 = new Circulo(10);
        Circulo c3 = new Circulo(15);
        Circulo c4 = new Circulo(20);
        Circulo c5 = new Circulo(25);

        System.out.println("Circulo 1: " + c1.calcularArea());
        System.out.println("Circulo 2: " + c2.calcularArea());
        System.out.println("Circulo 3: " + c3.calcularArea());
        System.out.println("Circulo 4: " + c4.calcularArea());
        System.out.println("Circulo 5: " + c5.calcularArea());
    }    
}
