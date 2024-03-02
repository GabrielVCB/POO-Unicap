import java.util.Scanner;
public class Questao06 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String nome1 = sc.nextLine();
        String nome2 = sc.nextLine();
        String maior;
        if (nome1.length() > nome2.length()) {
            maior = nome1;
        } else {
            maior = nome2;
        }
        System.out.println("O maior nome é: " + maior);
        sc.close();
    }
}

