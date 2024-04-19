import java.util.Scanner;
public class Q02_4 {//
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int idade = sc.nextInt();
        if (idade < 18) {
            System.out.println("Menor de idade");
        } else{
            System.out.println("Maior de idade");
        }
        sc.close();
    }
}
