import java.util.*;
public class ReverseANumber {
    public int reverse(int num) {
        int x = 0;
        while (num != 0) {
            int digit = num % 10;
            num = num / 10;
            if (x > Integer.MAX_VALUE / 10 || x < Integer.MIN_VALUE / 10) {
                return 0;
            }
            x = x * 10 + digit;
        }
        return x;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num;
        System.out.print("Enter a number: ");
        num = sc.nextInt();
        ReverseANumber sol = new ReverseANumber();
        System.out.println("Reversed number: " + sol.reverse(num));
        sc.close();
    }
}
