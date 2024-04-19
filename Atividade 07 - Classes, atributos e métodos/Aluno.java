public class Aluno {
    String nome;
    double cpf;
    double nota1;
    double nota2;
    double nota3;
    double nota4;

    public Aluno(String nome,double cpf, double nota1,double nota2,double nota3,double nota4) {
        this.nome = nome;
        this.cpf = cpf;
        this.nota1 = nota1;
        this.nota2 = nota2;
        this.nota3 = nota3;
        this.nota4 = nota4;
    }

    public double calcularMedia() {
        double media = (nota1 + nota2 + nota3 + nota4) / 4;
        return media;
    }

}
