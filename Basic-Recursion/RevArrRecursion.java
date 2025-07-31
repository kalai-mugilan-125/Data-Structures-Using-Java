import java.util.*;
public class RevArrRecursion {
    public ArrayList<Integer> Reverse(ArrayList<Integer> nums){
        ArrayList<Integer> revArr = new ArrayList<>();
        for(int i = nums.size() - 1; i >=0 ; i--){
            revArr.add(nums.get(i));
        }
        return revArr;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        System.out.print(" Enter the size of the Array :");
        n = sc.nextInt();
        ArrayList<Integer> nums = new ArrayList<>();
        for(int i = 0 ; i < n ; i++){
            System.out.print(" Enter the "+(i+1)+"th element of the array :");
            int x = sc.nextInt();
            nums.add(x);
        }
        RevArrRecursion sol = new RevArrRecursion();
        ArrayList<Integer> revArr = new ArrayList<>();
        revArr = sol.Reverse(nums);
        System.out.println("The Original Array:");
        for(int i : nums){
            System.out.print(i+" ");
        }
        System.out.println();
        System.out.println("The Reversed Array:");
        for(int i : revArr){
            System.out.print(i+" ");
        }
        System.out.println();
        sc.close();
    }
}
