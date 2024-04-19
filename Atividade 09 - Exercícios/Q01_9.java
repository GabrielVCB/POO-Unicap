import java.util.ArrayList;
public class Q01_9 {
    public static void main(String[] args) {
        ArrayList<Funcionario> funcionarios = new ArrayList<Funcionario>();
        funcionarios.add(new Funcionario("João", 60.000, 25));
        funcionarios.add(new Funcionario("Maria", 48.000, 29));
        funcionarios.add(new Funcionario("Pedro", 55.000, 28));
        funcionarios.add(new Funcionario("Ana", 10.000, 22));
        for(Funcionario empregado : funcionarios) {
            if(empregado.getSalarioAnual() < 50.000 && empregado.getIdade() < 30) {
                System.out.println(empregado.getNome());
            }
        }
    }
}
