import java.util.Scanner;
public class Q11_4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float salario, aumento;
        salario = sc.nextFloat();
        if (salario > 1500)
            aumento = salario * 1.10f;
        else
            aumento = salario * 1.15f;
        System.out.printf("Seu novo salário é R$%.2f", aumento);
        sc.close();
    }
}
