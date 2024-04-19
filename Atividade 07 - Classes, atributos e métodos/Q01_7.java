public class Q01_7 {
    public static void main(String[] args) {
        Paciente paciente = new Paciente(1, "Gabriel", "10/08", 'M', "Plano Normal", "Poeira", "O+");
        System.out.printf("Código: %d\nNome: %s\nData de nascimento: %s\nSexo: %c\nPlano de saúde: %s\nAlergia: %s\nTipo sanguineo: %s\n\n", paciente.codigo, paciente.nome, paciente.dataNascimento, paciente.sexo, paciente.planoSaude, paciente.alergia, paciente.tipoSanguineo);
        paciente.codigo = 2;
        paciente.nome = "Maria";
        paciente.dataNascimento = "01/01";
        paciente.sexo = 'F';
        paciente.planoSaude = "Plano VIP";
        paciente.alergia = "Camarao";
        paciente.tipoSanguineo = "O-";
        System.out.printf("Apos modificacao: \nCódigo: %d\nNome: %s\nData de nascimento: %s\nSexo: %c\nPlano de saúde: %s\nAlergia: %s\nTipo sanguineo: %s\n", paciente.codigo, paciente.nome, paciente.dataNascimento, paciente.sexo, paciente.planoSaude, paciente.alergia, paciente.tipoSanguineo);
    }
}
