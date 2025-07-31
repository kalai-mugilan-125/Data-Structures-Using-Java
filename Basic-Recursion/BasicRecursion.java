import java.util.*;

public class BasicRecursion {
    int count = 0;
    int n ;
    void print(int num){
        n = num;
        print();
    }
    void print(){
        
        if(count == n) {
            System.out.println();
            return;
        }
        System.out.print(count+" ");
        count++;
        print();
        
    }
    public static void main(String[] args) {
        int n;
        System.out.print("Enter the Digit to print using recursion : ");
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        BasicRecursion sol = new BasicRecursion();
        sol.print(n);
        sc.close();
    }
}
