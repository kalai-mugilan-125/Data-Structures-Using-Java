import java.util.*;
public class CountDigits {
    public int countDigits(int num) {
        int count = 0;
        while (num > 0) {
            count++;
            num /= 10;
        }
        return count;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int num = sc.nextInt();
        CountDigits sol = new CountDigits();
        int result = sol.countDigits(num);
        System.out.println("Total Digits: " + result);
        sc.close();
    }
}
