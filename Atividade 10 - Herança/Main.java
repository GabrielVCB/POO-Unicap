public class Main {
    public static void main(String[] args) {
        Professor professor = new Professor("João", "1234", 3000.00, "Manhã");
        Diretor diretor = new Diretor("Maria", "5678", 5000.00, "Tarde");
        Coordenador coordenador = new Coordenador("Carlos", "9101", 4000.00, "Noite");
        Secretario secretario = new Secretario("Ana", "1121", 2000.00, "Manhã");

        System.out.println("Professor:");
        professor.horariosDisponiveis();
        System.out.println("Horário de trabalho: " + professor.horarioTrabalho());
        professor.informacoesFuncionario();
        professor.funcaoDesempenhar();

        System.out.println("\nDiretor:");
        diretor.horariosDisponiveis();
        System.out.println("Horário de trabalho: " + diretor.horarioTrabalho());
        diretor.informacoesFuncionario();
        diretor.funcaoDesempenhar();

        System.out.println("\nCoordenador:");
        coordenador.horariosDisponiveis();
        System.out.println("Horário de trabalho: " + coordenador.horarioTrabalho());
        coordenador.informacoesFuncionario();
        coordenador.funcaoDesempenhar();

        System.out.println("\nSecretario:");
        secretario.horariosDisponiveis();
        System.out.println("Horário de trabalho: " + secretario.horarioTrabalho());
        secretario.informacoesFuncionario();
        secretario.funcaoDesempenhar();
    }
}
