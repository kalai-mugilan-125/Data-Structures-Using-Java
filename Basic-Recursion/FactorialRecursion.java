import java.util.*;
public class FactorialRecursion {
    int mul = 1;
    void Factorial(int i ,int num){
        if(i > num){
            System.out.println("Factorial of "+num+" is " + mul);
            return;
        }
        mul*=i;
        Factorial(i+1, num);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number to find Factorial for : ");
        int num;
        num = sc.nextInt();
        FactorialRecursion sol = new FactorialRecursion();
        sol.Factorial(1, num);
        sc.close();
    }
}
