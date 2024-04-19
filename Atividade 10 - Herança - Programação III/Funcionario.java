public abstract class Funcionario {
    private String nome;
    private String inscricao;
    private double salario;
    private String turno;
    
    public Funcionario(String nome, String inscricao, double salario, String turno) {
        this.nome = nome;
        this.inscricao = inscricao;
        this.salario = salario;
        this.turno = turno;
    }

    public void horariosDisponiveis() {
        String[] todosOsTurnos = {"Manhã", "Tarde", "Noite"};
        System.out.println("O funcionário está disponível nos seguintes turnos:");
        for (String turno : todosOsTurnos) {
            if (!turno.equals(this.turno)) {
                System.out.println(turno);
            }
        }
    }
    
    public String horarioTrabalho() {
        return this.turno;
    }

    public void informacoesFuncionario() {
        System.out.printf("Informacoes:\n\tNome: %s\n\tInscricao: %s\n\tSalario: %f\n\tTurno: %s\n",this.nome,this.inscricao,this.salario,this.turno);
    }
    public abstract void funcaoDesempenhar();

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getInscricao() {
        return inscricao;
    }

    public void setInscricao(String inscricao) {
        this.inscricao = inscricao;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public String getTurno() {
        return turno;
    }

    public void setTurno(String turno) {
        this.turno = turno;
    }
    
}