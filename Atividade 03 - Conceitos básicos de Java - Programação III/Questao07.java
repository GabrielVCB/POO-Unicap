import java.util.Scanner;

public class Questao07 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String nome = sc.nextLine();
        String sobrenome = sc.nextLine();
        System.out.printf("%s %s", nome, sobrenome);
        sc.close();
    }
}
