import java.util.*;
public class PaliRecursion {
    public boolean isPali(int left,int right,String str){
        if(left >= right){
            return true;
        }
        if(Character.toLowerCase(str.charAt(left)) != Character.toLowerCase(str.charAt(right))){
            return false;
        }
        return isPali(left+1, right-1, str);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str;
        System.out.print("Enter the string to check it is a Palindrome : ");
        str = sc.nextLine();
        StringBuilder str1 = new StringBuilder();
        for(char ch : str.toCharArray()){
            if(Character.isLetterOrDigit(ch)){
                str1.append(ch);
            }
        }
        PaliRecursion sol = new PaliRecursion();
        boolean active = sol.isPali(0, str1.length()-1, str1.toString());
        if(active){
            System.out.println("The given string is Palindrome!");
        }
        else{
            System.out.println("The given string is not a Palindrome!");
        }
        sc.close();
    }
}
