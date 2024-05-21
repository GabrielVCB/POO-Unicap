import java.util.Scanner;
// Exceção para dimensões inválidas do triângulo
class DimensoesInvalidasException extends Exception {
    public DimensoesInvalidasException(String message) {
        super(message);
    }
}

// Classe Triangulo com encapsulamento e abstração
class Triangulo {
    private double lado1;
    private double lado2;
    private double lado3;

    // Construtor que lança a exceção para dimensões inválidas
    public Triangulo(double lado1, double lado2, double lado3) throws DimensoesInvalidasException {
        if (!validarDimensoes(lado1, lado2, lado3)) {
            throw new DimensoesInvalidasException("Dimensões inválidas para formar um triângulo.");
        }
        this.lado1 = lado1;
        this.lado2 = lado2;
        this.lado3 = lado3;
    }

    // Método para validar se as dimensões formam um triângulo válido
    private boolean validarDimensoes(double lado1, double lado2, double lado3) {
        return lado1 + lado2 > lado3 && lado1 + lado3 > lado2 && lado2 + lado3 > lado1;
    }

    // Métodos getter e setter encapsulados para os lados
    public double getLado1() {
        return lado1;
    }

    public void setLado1(double lado1) throws DimensoesInvalidasException {
        if (!validarDimensoes(lado1, lado2, lado3)) {
            throw new DimensoesInvalidasException("Dimensões inválidas para formar um triângulo.");
        }
        this.lado1 = lado1;
    }

    public double getLado2() {
        return lado2;
    }

    public void setLado2(double lado2) throws DimensoesInvalidasException {
        if (!validarDimensoes(lado1, lado2, lado3)) {
            throw new DimensoesInvalidasException("Dimensões inválidas para formar um triângulo.");
        }
        this.lado2 = lado2;
    }

    public double getLado3() {
        return lado3;
    }

    public void setLado3(double lado3) throws DimensoesInvalidasException {
        if (!validarDimensoes(lado1, lado2, lado3)) {
            throw new DimensoesInvalidasException("Dimensões inválidas para formar um triângulo.");
        }
        this.lado3 = lado3;
    }
}

// Classe principal para testar
public class Q05_14 {
    public static void main(String[] args) {
        try {
            // Instanciar um objeto Triangulo com lados 3, 4 e 5
            Triangulo triangulo1 = new Triangulo(3, 4, 5);

            // Modificar a dimensão do primeiro lado para 10
            triangulo1.setLado1(10);

            // Ler três números do usuário
            Scanner sc = new Scanner(System.in);
            System.out.println("Digite três números para os lados do triângulo:");
            double lado1 = sc.nextDouble();
            double lado2 = sc.nextDouble();
            double lado3 = sc.nextDouble();

            // Instanciar um objeto Triangulo usando os valores lidos como lados
            Triangulo triangulo2 = new Triangulo(lado1, lado2, lado3);

            // Se chegou aqui, os triângulos foram criados com sucesso
            System.out.println("Triângulo 1: Lados " + triangulo1.getLado1() + ", " +
                    triangulo1.getLado2() + ", " + triangulo1.getLado3());
            System.out.println("Triângulo 2: Lados " + triangulo2.getLado1() + ", " +
                    triangulo2.getLado2() + ", " + triangulo2.getLado3());

            sc.close();
        } catch (DimensoesInvalidasException e) {
            System.out.println("Erro ao criar o triângulo: " + e.getMessage());
        }
    }
}
