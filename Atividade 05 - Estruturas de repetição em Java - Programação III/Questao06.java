import java.util.Scanner;

public class Questao06 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        int x;
        int soma = 0;
        while (number > 10) {
            x = number%10;
            if (x%2==0) {
                soma+=x;
            }
            number/=10;
        } if (number%2 ==0) 
            soma+=number;
        System.out.printf("Soma dos dígitos: %d", soma);
        
        sc.close();
    }
}