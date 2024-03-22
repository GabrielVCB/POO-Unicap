public class Main {

    public static void main(String[] args) {
      ContaBancaria contaAugusto = new ContaBancaria(100, "0022", "0033", "José Mário");
      ContaBancaria contaMaria = new ContaBancaria(50, "002", "0043", "Maria");
  
      System.out.println("Saldo na conta: " + contaAugusto.saldo);
      contaAugusto.creditar(100, 10);
      System.out.println("Saldo na conta: " + contaAugusto.saldo);
      contaAugusto.debitar(2);
      System.out.println("Saldo na conta: " + contaAugusto.saldo);
    }
  }