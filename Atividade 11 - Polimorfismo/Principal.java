import java.time.LocalDate;
public class Principal {
    public static void main(String[] args) {
        Livro l1 = new Livro("Narnia", 1945, 12,"Lewis");
        DVD dvd = new DVD("Django", 2010,300,140);
        Revista revista = new Revista("Recreio", 200, 55, 29);
        LocalDate dataEmprestimo = LocalDate.of(2024, 4, 1);
        LocalDate dataDevolucao = LocalDate.of(2024, 5, 5);
        int prazoDevolucao = 30;
        l1.calcular_multa(dataEmprestimo, dataDevolucao, prazoDevolucao);
        l1.devolucao();
        System.out.println(l1.getCopDisponiveis());
        l1.emprestimo();
        System.out.println(l1.getCopDisponiveis());
    }
}
