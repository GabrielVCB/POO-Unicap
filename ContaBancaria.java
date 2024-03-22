public class ContaBancaria {
    double saldo;
    String conta;
    String agencia;
    String nomePessoa;
  
    public ContaBancaria(double saldo, String conta, String agencia, String nomePessoa) {
      this.saldo = saldo;
      this.conta = conta;
      this.agencia = agencia;
      this.nomePessoa = nomePessoa;
    }
  
    public void creditar(double valor) {
      this.saldo = this.saldo + valor;
      // this.saldo += valor;
    }
  
    public void creditar(double valor, int plus) {
      this.saldo = this.saldo + valor + (valor * plus / 100);
    }
  
    public void debitar(double valor) {
      this.saldo = this.saldo - valor;
    }
  }
  