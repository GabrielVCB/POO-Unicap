import java.util.Scanner;
public class Questao07 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char caractere = sc.next().charAt(0);
        if (caractere == 'a' || caractere == 'e' || caractere == 'i' || caractere == 'o' || caractere == 'u') {
            System.out.println("Vogal");
        } else {
            System.out.println("Consoante");
        }
        sc.close();
    }
}
