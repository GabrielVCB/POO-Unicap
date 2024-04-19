import java.util.Scanner;
public class Q01_4 {//
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        if (number < 0) {
            System.out.println("Negative");
        }
        else if (number==0) {
            System.out.println("Nulo");
        }
        else {
            System.out.println("Positivo");
        }
        sc.close();
    }
}
