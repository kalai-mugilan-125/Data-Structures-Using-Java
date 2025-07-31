import java.util.*;

public class NumbersRecursion {
    void numbers(int i , int n){
        if(i > n) {
            System.out.println();
            return;
        }
        System.out.print(i + " ");
        numbers(i+1,n);
    }  
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int nums;
        System.out.print("Enter the Number to print from 1 : ");
        nums = sc.nextInt();
        NumbersRecursion sol = new NumbersRecursion();
        sol.numbers(1,nums);
        sc.close();
    }

}
