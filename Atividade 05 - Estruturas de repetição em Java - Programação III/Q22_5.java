public class Q22_5 {
    public static void main(String[] args) {
        int number = 50, sum = 0;
        while (number <= 100) {
            sum += number;
            number++;
        }
        double media = sum / 51.0;
        System.out.printf("Média: %.2f", media);
    }
}