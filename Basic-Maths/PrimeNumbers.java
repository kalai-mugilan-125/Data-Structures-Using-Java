import java.util.*;
public class PrimeNumbers {
    public boolean isPrime(int n){
        if (n < 2) return false;
        for(int i = 2 ; i <= Math.sqrt(n) ; i++){
            if(n % i == 0){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num ;
        System.out.print("Enter the input number : ");
        num = sc.nextInt();
        PrimeNumbers sol = new PrimeNumbers();
        if(sol.isPrime(num)){
            System.out.println("The given number is Prime");
        }
        else{
            System.out.println("The given number is not Prime");
        }
        sc.close();
    }
}   
