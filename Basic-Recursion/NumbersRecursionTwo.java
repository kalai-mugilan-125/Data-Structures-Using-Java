import java.util.Scanner;

public class NumbersRecursionTwo {
    void numbers(int n){
        if(n == 0) {
            System.out.println();
            return;
        }
        System.out.print(n + " ");
        numbers(n-1);
    }  
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int nums;
        System.out.print("Enter the Number to print upto 1 : ");
        nums = sc.nextInt();
        NumbersRecursionTwo sol = new NumbersRecursionTwo();
        sol.numbers(nums);
        sc.close();
    }
    
}
