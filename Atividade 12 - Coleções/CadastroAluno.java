import java.util.ArrayList;
public class CadastroAluno {
    private ArrayList<Aluno> alunos = new ArrayList<>();
    
    public void adicionarAluno(Aluno aluno) {
        alunos.add(aluno);
    }

    public void listarAlunos() {
        for (Aluno aluno : alunos) {
            System.out.println(aluno);
        }
    }
    
    public static void main(String[] args) {
        CadastroAluno cadastro = new CadastroAluno();
        Aluno a1 = new Aluno(1, "João", 20, "ADS");
        Aluno a2 = new Aluno(2, "Maria", 21, "ADS");
        Aluno a3 = new Aluno(3, "José", 22, "ADS");
        Aluno a4 = new Aluno(4, "Ana", 23, "ADS");
        Aluno a5 = new Aluno(5, "Carlos", 24, "ADS");
        
        cadastro.adicionarAluno(a1);
        cadastro.adicionarAluno(a2);
        cadastro.adicionarAluno(a3);
        cadastro.adicionarAluno(a4);
        cadastro.adicionarAluno(a5);
        
        cadastro.listarAlunos();
    }
}
