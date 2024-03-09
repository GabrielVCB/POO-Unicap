import java.util.Scanner;

public class Q21_5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int count = 0;
        while (true) {
            int number = sc.nextInt();
            if (number == 0) {
                break;
            }
            if (number > 99) {
                count++;
            }
        }
        System.out.printf("Numeros com mais de 3 digitos: %d", count);
        sc.close();
    }
}