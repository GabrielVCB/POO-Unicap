import java.util.Scanner;
public class Q02_6 {
    public static void data(int dia, int mes, int ano) {
        String meses = "Init";
        switch(mes) {
            case 1:
                meses = "Janeiro";
                break;
            case 2:
                meses = "Fevereiro";
                break;
            case 3:
                meses = "Maio";
                break;
            case 4:
                meses = "Abril";
                break;
            case 5:
                meses = "Março";
                break;
            case 6:
                meses = "Junho";
                break;
            case 7:
                meses = "Julho";
                break;
            case 8:
                meses = "Agosto";
                break;
            case 9:
                meses = "Setembro";
                break;
            case 10:
                meses = "Outubro";
                break;
            case 11:
                meses = "Novembro";
                break;
            case 12:
                meses = "Dezembro";
                break;
        }
        System.out.printf("%d de %s de %d", dia, meses, ano);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Insira o dia:");
        int dia = sc.nextInt();
        System.out.println("Insira o mes :");
        int mes = sc.nextInt();
        System.out.println("Insira o ano :");
        int ano = sc.nextInt();
        data(dia, mes, ano);
        sc.close();
    }
}
