import java.util.Scanner;

public class Q19_5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int div2 = 0, div3 = 0, div5 = 0;
        while (true) {
            int number = sc.nextInt();
            if (number == 0) {
                break;
            }
            if (number%2 == 0) {
                div2++;
            } if (number%3 == 0) {
                div3++;
            } if (number%5 == 0) {
                div5++;
            }
        } 
        System.out.printf("Divisiveis por 2: %d\nDivisiveis por 3 %d\nDivisiveis por 5: %d",div2, div3, div5);
        sc.close();
    }
}