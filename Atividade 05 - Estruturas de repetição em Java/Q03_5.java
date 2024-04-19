import java.util.Scanner;

public class Q03_5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        int divisor = 1;
        while (divisor < number) {
            if (number%divisor == 0) {
                System.out.println(divisor);
            }
            divisor++;
        }
        sc.close();
    }
}