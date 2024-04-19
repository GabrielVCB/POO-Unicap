import java.util.Scanner;

public class Q17_5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int pares = 0;
        while (true) {
            int number = sc.nextInt();
            if (number == 0) {
                System.out.println(pares);
                break;
            }
            if (number%2 == 0) {
                pares++;
            } else {
                System.out.println(pares);
                break;
            }
        }
        sc.close();
    }
}