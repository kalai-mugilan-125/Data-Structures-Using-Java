import java.util.*;
public class NameRecursion{
     int count = 0;
    int n ;
    void print(int num,String str){
        n = num;
        print(str);
    }
    void print(String str){
        
        if(count == n) {
            System.out.println();
            return;
        }
        System.out.println(str);
        count++;
        print(str);
        
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str;
        int n;
        System.out.print("Enter the Name to print using recursion : ");
        str = sc.nextLine();
        System.out.print("Enter the Digit to print using recursion : ");
        n = sc.nextInt();
        NameRecursion sol = new NameRecursion();
        sol.print(n,str);
        sc.close();

        
    }
}