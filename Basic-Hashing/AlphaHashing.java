import java.util.Scanner;

public class AlphaHashing{
    public void computeHash(char[] nums1,int[] nums2){
        for(int i = 0 ; i < nums1.length ; i++){
            nums2[nums1[i]]++;
        }
        for(int i = 0 ; i < nums2.length ; i++){
            System.out.println("The term " + i + " Has a freq of "+ nums2[i]);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = 0;
        System.out.print("Enter the Size of the array:");
        n = sc.nextInt();
        char[] nums = new char[n];
        for(int i = 0 ; i < n ; i++){
            nums[i] = sc.next().charAt(0);
        }
        int[] nums2 = new int[256];
        AlphaHashing sol = new AlphaHashing();
        sol.computeHash(nums, nums2);
        sc.close();        
    }
}