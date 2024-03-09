import java.util.Scanner;
public class Q12_4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number;
        number = sc.nextInt();
        if (number % 5 == 0 && number % 3 == 0)
            System.out.println("Este número é divisível por 3 e por 5");
        else
            System.out.println("Este número não é divisível por 3 e por 5");
        sc.close();
    }
}
