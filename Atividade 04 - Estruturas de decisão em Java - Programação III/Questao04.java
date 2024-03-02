import java.util.Scanner;
public class Questao04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        if  (number % 2 == 0) {
            System.out.println("Par");
        } else {
            System.out.println("Ímpar");
        }    
        sc.close();
    }
}
