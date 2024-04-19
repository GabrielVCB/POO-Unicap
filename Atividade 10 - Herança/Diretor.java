public class Diretor extends Funcionario {
    public Diretor(String nome, String inscricao, double salario, String turno) {
        super(nome, inscricao, salario, turno);
    }

    @Override
    public void horariosDisponiveis() {
        super.horariosDisponiveis();
    }

    @Override
    public String horarioTrabalho() {
        return super.horarioTrabalho();
    }

    @Override
    public void informacoesFuncionario() {
        super.informacoesFuncionario();
    }

    @Override
    public void funcaoDesempenhar() {
        System.out.println("Funções do Diretor:");
        System.out.println("\t1. Criar descontos");
        System.out.println("\t2. Encomendar fardas");
        System.out.println("\t3. Gerenciar professores");
    }
}
