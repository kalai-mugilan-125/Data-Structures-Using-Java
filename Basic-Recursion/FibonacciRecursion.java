import java.util.*;
public class FibonacciRecursion{
    int num1 = 0;
    int num2 = 1;

    void Fibonacci(int num,int i){
        if( i >= num){
            System.out.println("The Fibonacci upto term "+num+" is "+num1);
            return;
        }
        int temp = num1+num2;
        num1 = num2;
        num2 = temp;
        i++;
        Fibonacci(num, i);
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int num;
        FibonacciRecursion sol = new FibonacciRecursion();
        System.out.print("Enter the number to calculate the fibonacci series upto : ");
        num = sc.nextInt();
        sol.Fibonacci(num,0);
        sc.close();
    }
}