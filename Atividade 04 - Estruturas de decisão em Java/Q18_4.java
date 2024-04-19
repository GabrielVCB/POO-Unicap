import java.util.Scanner;
public class Q18_4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x, a, b, soma, subtracao, multiplicacao, divisao;
        System.out.println("Digite 2 números:");
        a = sc.nextInt();
        b = sc.nextInt();
        System.out.println("Digite a operação desejada:\nOpção 1 -- Soma\nOpção 2 -- Subtração\nOpção 3 -- Multiplicação\nOpção 4 -- Divisão");
        x = sc.nextInt();
        switch(x) {
            case 1:
                soma = a + b;
                System.out.println("O resultado da soma é: " + soma);
                break;
            case 2:
                subtracao = a - b;
                System.out.println("O resultado da subtração é: " + subtracao);
                break;
            case 3:
                multiplicacao = a * b;
                System.out.println("O resultado da multiplicação é: " + multiplicacao);
                break;
            case 4:
                if (b != 0) {
                    divisao = a / b;
                    System.out.println("O resultado da divisão é: " + divisao);
                } else {
                    System.out.println("Divisão por zero não é permitida.");
                }
                break;
            default:
                System.out.println("Opção inválida");
                break;
        }
        sc.close();
    }
}
