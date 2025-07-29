import java.util.*;

public class CountDigits{
    public static void main(String[] args){
        Scanner sc =  new Scanner(System.in);
        int num;
        System.out.print("Enter the number:");
        num = sc.nextInt();
        int count = 0;
        while(num>0){
            int n = num%10;
            count++;
            num/=10;
        }
        System.out.println("Total Digits : " + count);
    }
}