import java.util.Scanner;

public class Q16_5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int aluno = 1;
        while (aluno <= 5) {
            int nota = sc.nextInt();
            if (nota >= 7) {
                System.out.println("Aluno aprovado!");
            } else {
                System.out.println("Aluno reprovado.");
            }
            aluno++;
        }
        sc.close();
    }
}