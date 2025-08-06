import java.util.*;

public class CharacterHashing {
    public void computeHash(char[] nums1,int[] nums2){
        for(int i = 0 ; i < nums1.length ; i++){
            if(nums1[i] >= 'a' && nums1[i] <= 'z'){
                nums2[nums1[i] - 'a']++;
            }
            else{
                System.out.println("Invalid Input Character");
            }
        }
        for(int i = 0 ; i < nums2.length ; i++){
            System.out.println("The char " + (char)(i + 'a') + " Has a freq of "+ nums2[i]);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = 0;
        System.out.print("Enter the Size of the array:");
        n = sc.nextInt();
        char[] nums = new char[n];
        sc.nextLine();
        for(int i = 0 ; i < n ; i++){
            String input = sc.nextLine();
            if(input.length()>0){
                nums[i] = input.charAt(0);
            }
        }
        int[] nums2 = new int[26];
        CharacterHashing sol = new CharacterHashing();
        sol.computeHash(nums, nums2);
        sc.close();
    }
}