import java.util.Scanner;

public class Q23_5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int menor = 100000;
        while(true) {
            int number = sc.nextInt();
            if (number == 0) {
                break;
            }
            if (number > 0) {
                if (number%2 != 0) {
                    if (number < menor) {
                        menor = number;
                    }
                }
            }
        }
        System.out.println(menor);
        sc.close();
    }
}