import java.util.Scanner;
public class Q01_6 {
    public static int dobro(int number) {
        return number * 2;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Insira o numero: ");
        int x = sc.nextInt();
        System.out.println(dobro(x));
        sc.close();
    }
}
