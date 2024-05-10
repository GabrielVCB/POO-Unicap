import java.util.HashMap;
import java.util.Scanner;
public class TesteMapaAluno {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        HashMap<Integer, Aluno> mapa = new HashMap<>();
        Aluno a1 = new Aluno("João", 20, "ADS");
        Aluno a2 = new Aluno("Maria", 21, "ADS");
        Aluno a3 = new Aluno("José", 22, "ADS");
        Aluno a4 = new Aluno("Ana", 23, "ADS");
        System.out.println("Digite a matrícula dos alunos:");
        int matriculaA1 = sc.nextInt();
        a1.setMatricula(matriculaA1);
        int matriculaA2 = sc.nextInt();
        a2.setMatricula(matriculaA2);
        int matriculaA3 = sc.nextInt();
        a3.setMatricula(matriculaA3);
        int matriculaA4 = sc.nextInt();
        a4.setMatricula(matriculaA4);


        mapa.put(matriculaA1, a1);
        mapa.put(matriculaA2, a2);
        mapa.put(matriculaA3, a3);
        mapa.put(matriculaA4, a4);
        System.out.println("Digite a matrícula do aluno que deseja consultar:");
        int matricula = sc.nextInt();
        Aluno aluno = mapa.get(matricula);
        if (aluno != null) {
            System.out.println("Nome: " + aluno.getNome());
            System.out.println("Idade: " + aluno.getIdade());
            System.out.println("Curso: " + aluno.getCurso());
        } else {
            System.out.println("Aluno não encontrado.");
        }
    }
}
