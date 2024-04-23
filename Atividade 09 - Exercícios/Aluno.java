public class Aluno {
    private String nome;
    private int matricula;
    private double[] notas;

    public Aluno(String nome, int matricula, double[] notas) {
        this.nome = nome;
        this.matricula = matricula;
        this.notas = notas;
    }

    public double[] getNotas() {
        return notas;
    }
    public String getNome() {
        return nome;
    }

    public void calcularMedia() {
        double soma = 0;
        for (double nota : notas) {
            soma += nota;
        }
        double media = soma / notas.length;
        if(media >= 7) {
            System.out.printf("Aluno %s aprovado!\n",this.nome);
        } else {
            System.out.printf("Aluno %s reprovado!\n",this.nome);
        }
    }

}
