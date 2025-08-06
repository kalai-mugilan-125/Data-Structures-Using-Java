import java.util.*;

public class IntegerHashing {

    public void computeHash(int[] nums1,int[] nums2){
        for(int i = 0 ; i < nums1.length ; i++){
            nums2[nums1[i]]++;
        }
        for(int i = 0 ; i < nums2.length ; i++){
            System.out.println("The number " + i + " Has a freq of "+ nums2[i]);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = 0;
        System.out.print("Enter the Size of the array:");
        n = sc.nextInt();
        int HashSize = Integer.MIN_VALUE;
        int[] nums = new int[n];
        for(int i = 0 ; i < n ; i++){
            nums[i] = sc.nextInt();
            HashSize = Math.max(nums[i],HashSize);
        }
        int[] nums2 = new int[HashSize+1];
        IntegerHashing sol = new IntegerHashing();
        sol.computeHash(nums, nums2);
        sc.close();        
    }
    
}
