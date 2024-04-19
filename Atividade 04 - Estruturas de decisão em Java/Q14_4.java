import java.util.Scanner;
public class Q14_4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numero;
        System.out.println("Digite um número:");
        numero = sc.nextInt();
        switch(numero) {
            case 1:
                System.out.println("Muito insuficiente");
                break;
            case 2:
                System.out.println("Insuficiente");
                break;
            case 3:
                System.out.println("Regular");
                break;
            case 4:
                System.out.println("Bom");
                break;
            case 5:
                System.out.println("Muito bom");
                break;
            default:
                System.out.println("Número inválido");
                break;
        }
        sc.close();
    }
}
