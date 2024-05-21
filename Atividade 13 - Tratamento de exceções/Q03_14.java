import java.util.Scanner;
import java.util.InputMismatchException;

public class Q03_14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);   
        try {
            double a = sc.nextDouble();
            double b = sc.nextDouble(); 
            if (b == 0) {
                throw new ArithmeticException("Divisão por zero");
            }
            double divisao = a / b;
            System.out.println("Resultado: " + divisao);  
        } catch (ArithmeticException error) {
            System.out.println(error.getMessage());
        } catch (InputMismatchException error) {
            System.out.println("Entrada inválida");
        } finally {
            sc.close();
        }
    }
}