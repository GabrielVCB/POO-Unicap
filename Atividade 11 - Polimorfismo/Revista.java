import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
public class Revista extends ItemBiblioteca {
    private int edicao;

    public Revista(String titulo, int anoPubli, int copDisponiveis, int edicao) {
        this.setTitulo(titulo);
        this.setAnoPubli(anoPubli);
        this.setCopDisponiveis(copDisponiveis);
        this.edicao = edicao;
    }

    @Override
    public void calcular_multa(LocalDate dataEmprestimo, LocalDate dataDevolucao, int prazoDevolucao) {
        long diasAtraso = ChronoUnit.DAYS.between(dataEmprestimo.plusDays(prazoDevolucao), dataDevolucao);
        double multa = 0;

        if (diasAtraso > 0) {
            multa = 10 * diasAtraso;
        }

        System.out.println("Multa a ser paga: R$ " + multa);
    }

    @Override
    public void devolucao() {
        this.setCopDisponiveis(this.getCopDisponiveis() + 1);    
    }

    @Override
    public void emprestimo() {
        this.setCopDisponiveis(this.getCopDisponiveis() - 1);        
    }

}
