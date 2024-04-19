//Teste Questão 2
import java.util.Scanner;
public class test {
   public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      Carro carro = new Carro("BMW", "X6", 2023, 110);
      System.out.printf("Marca: %s\nModelo: %s\nAno de fabricacao: %d\nVelocidade atual: %d\n\n",carro.getMarca(), carro.getModelo(), carro.getAnoFabricacao(), carro.getVelAtual());
      int acelerada = sc.nextInt();
      carro.acelerar(acelerada);
      System.out.printf("Marca: %s\nModelo: %s\nAno de fabricacao: %d\nVelocidade atual: %d\n\n",carro.getMarca(), carro.getModelo(), carro.getAnoFabricacao(), carro.getVelAtual());
      sc.close();
   } 
}
