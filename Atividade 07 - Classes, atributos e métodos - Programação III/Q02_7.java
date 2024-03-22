public class Q02_7 {
    public static void main(String[] args) {
        Endereco endereco = new Endereco("Agamenon", 1141,"apt 202", "Santo Amaro", "Recife", "PE", 12345678);
        Medico medico = new Medico(1, "Augusto", 'M', "Pediatra", "Espinheiro");
        System.out.printf("Endereco:\nRua: %s\nNumero: %d\nComplemento: %s\nBairro: %s\nCidade: %s\nUF: %s\nCEP: %d\n",endereco.rua, endereco.numero,endereco.complemento,endereco.bairro,endereco.cidade,endereco.uf,endereco.cep);
        System.out.printf("Medico:\nCodigo: %d\nNome: %s\nSexo: %c\nEspecialidade: %s\nEndereco: %s\n\n",medico.codigo,medico.nome,medico.sexo,medico.especialidade,medico.endereco);
        endereco.rua = "Mario Melo";
        endereco.numero = 777;
        endereco.complemento = "apt. 1001";
        endereco.bairro = "Janga";
        endereco.cidade = "Olinda";
        endereco.uf = "PE";
        endereco.cep = 87654321;

        medico.codigo = 2;
        medico.nome = "Andrea";
        medico.sexo = 'F';
        medico.especialidade = "Cirurgiao";
        medico.endereco = "Gracas";

        System.out.printf("Apos Alteracao:\nEndereco:\nRua: %s\nNumero: %d\nComplemento: %s\nBairro: %s\nCidade: %s\nUF: %s\nCEP: %d\n",endereco.rua, endereco.numero,endereco.complemento,endereco.bairro,endereco.cidade,endereco.uf,endereco.cep);
        System.out.printf("Medico:\nCodigo: %d\nNome: %s\nSexo: %c\nEspecialidade: %s\nEndereco: %s\n",medico.codigo,medico.nome,medico.sexo,medico.especialidade,medico.endereco);
    }
}
