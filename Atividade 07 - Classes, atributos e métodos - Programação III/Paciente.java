//Questão 1

public class Paciente {
    int codigo;
    String nome;
    String dataNascimento;
    char sexo;
    String planoSaude;
    String alergia;
    String tipoSanguineo;

    public Paciente(int codigo, String nome, String dataNascimento, char sexo, String planoSaude, String alergia, String tipoSanguineo) {
        this.codigo = codigo;
        this.nome = nome;
        this.dataNascimento = dataNascimento;
        this.sexo = sexo;
        this.planoSaude = planoSaude;
        this.alergia = alergia;
        this.tipoSanguineo = tipoSanguineo;
    }
}
