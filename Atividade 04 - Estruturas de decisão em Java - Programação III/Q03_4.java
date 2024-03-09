import java.util.Scanner;
public class Q03_4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        if (n1 < n2) {
            System.out.printf("%d > %d",n2,n1);
        }
        else if (n1==n2) {
            System.out.println("Iguais");
        }
        else{
            System.out.printf("%d > %d", n1, n2);
        }
        sc.close();
    }
}