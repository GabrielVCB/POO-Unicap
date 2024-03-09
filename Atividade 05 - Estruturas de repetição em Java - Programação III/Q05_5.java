public class Q05_5 {
    public static void main(String[] args) {
        int number = 0;
        while (number <= 100) {
            if (number%3==0) {
                System.out.println("Fizz");
            } else if (number%5==0) {
                System.out.println("Buzz");
            } else {
                System.out.println(number);
            } 
            number++;
        }
    }
}