public class Professor extends Funcionario{

    public Professor(String nome, String inscricao, double salario, String turno) {
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
        System.out.println("Funções do Professor:");
        System.out.println("\t1. Lecionar");
        System.out.println("\t2. Criar atividades");
    }
    
}
