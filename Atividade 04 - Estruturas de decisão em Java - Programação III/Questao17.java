import java.util.Scanner;
public class Questao17 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite seu estado civil:");
        String estadoCivil = sc.nextLine();
        switch(estadoCivil) {
            case "solteiro":
                System.out.println("Você é solteiro");
                break;
            case "casado":
                System.out.println("Você é casado");
                break;
            case "divorciado":
                System.out.println("Você é divorciado");
                break;
            case "viuvo":
                System.out.println("Você é viúvo");   
                break;
            default:
                System.out.println("Opção inválida");
                break;
        }
        sc.close();
    }
}
