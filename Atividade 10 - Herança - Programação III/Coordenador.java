public class Coordenador extends Funcionario{
    public Coordenador(String nome, String inscricao, double salario, String turno) {
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
        System.out.println("Funções do Coordenador:");
        System.out.println("\t1. Auxiliar os professores");
        System.out.println("\t2. Organizar festivais");
    }
    
}
