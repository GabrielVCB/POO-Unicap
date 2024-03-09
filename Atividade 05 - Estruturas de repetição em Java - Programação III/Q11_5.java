import java.util.Scanner;

public class Q11_5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number, greatest = 0, minor = 1000;
        while (true) {
            number = sc.nextInt();
            if (number == 0) {
                break;
            }
            if (number < minor) {
                minor = number;
            } else if (number > greatest) {
                greatest = number;
            }
        } 
        System.out.printf("Maior: %d\nMenor: %d",greatest, minor);
        sc.close();
    }
}