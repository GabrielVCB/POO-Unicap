import java.util.Scanner;

public class Q12_5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number, sum = 0, count = 0;
        while (true) {
            number = sc.nextInt();
            if (number == -1) {
                break;
            }
            sum += number;
            count++;
        } 
        double media = sum / (double) count;
        
        System.out.printf("Media: %.2f", media);
        sc.close();
    }
}