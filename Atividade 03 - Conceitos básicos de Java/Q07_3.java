import java.util.Scanner;

public class Q07_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String nome = sc.nextLine();
        String sobrenome = sc.nextLine();
        System.out.printf("%s %s", nome, sobrenome);
        sc.close();
    }
}
