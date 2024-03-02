import java.util.Scanner;
public class Questao16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int idade;
        System.out.println("Digite sua idade:");
        idade = sc.nextInt();
        if (idade == 0 || idade == 1)
            System.out.println("Você é um bebê");
        else if (idade > 1 && idade < 13)
            System.out.println("Você é uma criança");
        else if (idade >= 13 && idade <= 18)
            System.out.println("Você é um adolescente");
        else
            System.out.println("Você é um adulto");
        sc.close();
    }
}
