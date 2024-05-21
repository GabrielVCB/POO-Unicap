import java.util.Scanner;

class SaldoInsuficienteException extends Exception {
    public SaldoInsuficienteException(String message) {
        super(message);
    }
}

class ContaCorrente {
    private int numeroConta;
    private double saldo;

    public ContaCorrente(int numeroConta, double saldo) {
        this.numeroConta = numeroConta;
        this.saldo = saldo;
    }

    public void sacar(double valor) throws SaldoInsuficienteException {
        if (valor > saldo) {
            throw new SaldoInsuficienteException("Saldo insuficiente.");
        }
        saldo -= valor;
    }

    public int getNumeroConta() {
        return numeroConta;
    }

    public void setNumeroConta(int numeroConta) {
        this.numeroConta = numeroConta;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
}

public class Q06_14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double newSaldo = sc.nextDouble();
        ContaCorrente conta = new ContaCorrente(123, newSaldo);
        for (int i = 0; i < 10; i++) {
            try {
                double newSaque = sc.nextDouble();
                conta.sacar(newSaque);
                System.out.println(conta.getSaldo());
            } catch (SaldoInsuficienteException e) {
                System.out.println(e.getMessage());
            }
        }
        sc.close();
    }
}
