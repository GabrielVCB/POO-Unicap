import java.util.Scanner;

public class Q20_5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int div3 = 0, count = 0;
        double media;
        while (true) {
            int number = sc.nextInt();
            if (number == 0) {
                break;
            }
            if (number%3 == 0) {
                div3++;
            }
            count++;
        } 
        if (div3 == 0) {
            System.out.println("Nenhum divisivel por 3 foi digitado");
        } else {
            media = div3 / (double) count;
            System.out.printf("Média de divisiveis por 3: %.2f", media);   
        }
        sc.close();
    }
}