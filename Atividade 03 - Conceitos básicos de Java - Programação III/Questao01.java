import java.util.Scanner;

public class Questao01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
        System.out.printf("Bem-vindo %s!", name);
        sc.close();
    }
}
