import java.util.Scanner;
public class Q13_4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String dia;
        System.out.println("Digite o dia da semana:");
        dia = sc.next().toLowerCase(); 
        if (dia.equals("sabado") || dia.equals("domingo")) {
            System.out.println("É fim de semana");
        } else {
            System.out.println("É dia útil");
        }
        sc.close();
    }
}
