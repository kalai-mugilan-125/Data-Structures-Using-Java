import java.util.*;


public class AllDivisors{
    public ArrayList<Integer> Divisors(int n){
        ArrayList<Integer> nums = new ArrayList<>();   
        for(int i = 1 ; i <= Math.sqrt(n);i++){
            if(n % i == 0){
                nums.add(i);
            }
            if(i != n / i){
                nums.add(n/i);
            }
        }
        return nums;
    }
    public static void main(String[] args) {
        ArrayList<Integer> nums = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        int a;
        System.out.print("Enter the digit to check all divisors : ");
        a = sc.nextInt();
        AllDivisors sol = new AllDivisors();
        nums = sol.Divisors(a);
        Collections.sort(nums);
        for(int num : nums){
            System.out.print(num+" ");
        }
        System.out.println();
        sc.close();
    }
} 