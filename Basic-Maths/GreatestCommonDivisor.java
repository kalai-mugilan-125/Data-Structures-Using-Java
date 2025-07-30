import java.util.*;
public class GreatestCommonDivisor {
    public int GCD(int a,int b){

        if(b == 0){
            return a;
        }
        return GCD(b,a%b);
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a , b;
        System.out.print("Enter the Numbers for which you want to find GCD : ");
        a = sc.nextInt();
        b = sc.nextInt();
        GreatestCommonDivisor sol = new GreatestCommonDivisor();
        int gcd = sol.GCD(a, b);
        System.out.println("The GCD of " + a + " and " + b + " is : " + gcd );
        sc.close();
    }
}
