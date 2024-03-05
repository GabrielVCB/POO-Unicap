import java.util.Scanner;
public class Carro {

    public mensagem calcularConsumo(int km, int litros) {
        if (result < 8) {
            return Mensagem.VENDA;
        } else if (result >=8 && result)
    }

    

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int distance = 0;
        int liters = 0;
        System.out.printf("Digite a distância em km: ");
        distance = sc.nextInt();
        System.out.printf("Digite os litros consumidos: ");
        liters = sc.nextInt();

        System.out.println(distance);
        System.out.println(liters);

        Carro carro = new Carro();
        carro.calcularConsumo(distance, liters);
    }
}
