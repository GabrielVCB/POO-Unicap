public class Secretario extends Funcionario{
    public Secretario(String nome, String inscricao, double salario, String turno) {
        super(nome, inscricao, salario, turno);
    }

    @Override
    public void funcaoDesempenhar() {
    }

    @Override
    public String horarioTrabalho() {
        return super.horarioTrabalho();
    }

    @Override
    public void horariosDisponiveis() {
        super.horariosDisponiveis();
    }

    @Override
    public void informacoesFuncionario() {
        System.out.println("Funções do Secretario:");
        System.out.println("\t1. Receber encomendas");
        System.out.println("\t2. Receber pagamentos");
    }

    
}
