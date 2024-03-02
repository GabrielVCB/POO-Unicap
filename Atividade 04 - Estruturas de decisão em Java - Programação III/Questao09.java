import java.util.Scanner;
public class Questao09 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Insira seu peso: ");
        double peso = sc.nextDouble();
        System.out.println("Insira sua altura: ");
        double altura = sc.nextDouble();
        double Imc =  peso / (altura * altura);
        if (Imc < 18.4) {
            System.out.println("Abaixo do peso");
        } else if (Imc > 18.4 && Imc < 25) {
            System.out.println("Peso normal");
        } else if (Imc >= 25 && Imc < 30) {
            System.out.println("Acima do peso");
        } else if (Imc >= 30 && Imc <= 40) {
            System.out.println("Obeso");
        } else if (Imc > 40) {
            System.out.println("Muito obeso");
        }
        sc.close(); 
    }
}
