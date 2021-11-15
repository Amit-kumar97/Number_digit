import java.util.Scanner;

public class Tens_digit {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int num ,n;
        num = s.nextInt();
        n = (num/10)%10;
        System.out.println("The tens digit is "+n);
    }
}
