//Questão 1
public class ContaBancaria {
  private String nomeTitular;
  private String numeroConta;
  private double saldo;

  public ContaBancaria(String nomeTitular, String numeroConta) {
      this.nomeTitular = nomeTitular;
      this.numeroConta = numeroConta;
      this.saldo = 0.0;
  }

  public String getNomeTitular() {
      return nomeTitular;
  }

  public void setNomeTitular(String nomeTitular) {
      this.nomeTitular = nomeTitular;
  }

  public String getNumeroConta() {
      return numeroConta;
  }

  public void setNumeroConta(String numeroConta) {
      this.numeroConta = numeroConta;
  }

  public double getSaldo() {
      return saldo;
  }

  public void setSaldo(double saldo) {
      this.saldo = saldo;
  }
}
//public void creditar(double valor) {
      //this.saldo = this.saldo + valor;
      // this.saldo += valor;
    //}
  
    //public void creditar(double valor, int plus) {
      //this.saldo = this.saldo + valor + (valor * plus / 100);
    //}
  
    //public void debitar(double valor) {
      //this.saldo = this.saldo - valor;
    //}