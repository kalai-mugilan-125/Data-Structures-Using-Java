import java.util.*;
public class AmstrongNumber {
    public boolean amstrongNumber(int temp){
        int n = 0;
        int num = temp;
        while(num > 0){
            int x = num % 10;
            n+=(x*x*x);
            num/=10;
        }
        return temp == n;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int num;
        System.out.print("Enter the number for which you need to find Amstrong Number : ");
        num = sc.nextInt();
        AmstrongNumber sol = new AmstrongNumber();
        if(sol.amstrongNumber(num)){
            System.out.println("The given Number "+num+" is an Amstrong number");
        }
        else{
            System.out.println("The given Number "+num+" is not an Amstrong number");
        }
        sc.close();
    }
}
