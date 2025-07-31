import java.util.Scanner;

public class SumRecursion {
    int total = 0;
    void numbers(int i , int n){
        if(i > n) {
            System.out.println("The sum from 1 to "+n+" is :" +total);
            return;
        }
        total+=i;
        numbers(i+1,n);
    }  
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int nums;
        System.out.print("Enter the Number to sum from 1 : ");
        nums = sc.nextInt();
        SumRecursion sol = new SumRecursion();
        sol.numbers(1,nums);
        sc.close();
    }
    
}
