public class Q03_9 {
    public static void main(String[] args) {
        Aluno[] alunos = {
            new Aluno("João", 1, new double[]{7.5, 8.0, 6.5}),
            new Aluno("Maria", 2, new double[]{5.0, 6.0, 4.5}),
            new Aluno("Pedro", 3, new double[]{8.0, 9.0, 7.5}),
            new Aluno("Ana", 4, new double[]{6.0, 7.0, 5.5})
        };

        System.out.println("Situação dos Alunos:");
        for (Aluno aluno : alunos) {
            aluno.calcularMedia();
        }
    }
}
