import java.util.*;
public class ReverseANumber{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int num;
        System.out.print("Enter a number :");
        num = sc.nextInt();
        int n = 0;
        while(num > 0){
            int x = num % 10;
            n+=x;
            num/=10;
            if(num <= 0){
                break;
            }
            n*=10;
        } 
        System.out.println("Reversed number :" + n);
    }
}