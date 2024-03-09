import java.util.Scanner;

public class Questao07 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        int x;
        while (number > 10) {
            x = number%10;
            System.out.print(x);
            number/=10;
        }
        System.out.print(number);
        sc.close();
    }
}