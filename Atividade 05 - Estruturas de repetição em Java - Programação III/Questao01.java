import java.util.Scanner;

public class Questao01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int aluno = 0;
        while (aluno < 5) {
            double nota = sc.nextDouble();
            if (nota >= 0 && nota <= 10) {
                if (nota >= 7) {
                    System.out.println("Aluno aprovado!");
                } else {
                    System.out.println("Aluno reprovado.");
                }
            } else {
                System.out.println("Nota invalida");
            }
            aluno++;
        }
        sc.close();
    }
}