import java.util.Scanner;
public class Questao01 {
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
