import java.util.Scanner;
public class Q08_4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        int n3 = sc.nextInt();
        int greatest12 = ((n1 + n2) +  Math.abs(n1 - n2)) / 2;
        int greatest = ((greatest12 + n3) + Math.abs(greatest12 - n3)) / 2;
        int minor12 = ((n1 + n2) - Math.abs(n1 - n2)) / 2;
        int minor = ((minor12 + n3) -  Math.abs(minor12 - n3)) / 2;
        int mid = (n1 + n2 + n3) - (greatest + minor);
        System.out.printf("%d < %d < %d",minor, mid, greatest);
        sc.close();
    }
}
