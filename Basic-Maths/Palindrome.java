import java.util.*;
public class Palindrome{
    public boolean isPalindrome(String str){
        int n = str.length();


        for(int i =0 ; i < n/2 ; i++){
            if(str.charAt(i) == str.charAt(n-i-1)){
                continue;
            }
            else {
                return false;
            }
        }
        return true;
    }
    public static void main(String[]  args){
        Scanner sc = new Scanner(System.in);
        String str;
        System.out.print("Enter the input to check it is a plaindrome or not : ");
        str = sc.nextLine();
        Palindrome sol = new Palindrome();
        boolean x = sol.isPalindrome(str);
        if(x){
            System.out.println("It is a palindrome");
        }
        else System.out.println("No, not a palindrome!");
        sc.close();
    }
}