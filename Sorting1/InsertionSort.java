package Sorting1;
import java.util.*;
public class InsertionSort {
    public void insertion(int[] nums){
        int n = nums.length;
        for(int i = 0 ; i < n;i++){
            int j = i;
            while(j>0 && nums[j-1] > nums[j]){
                int temp = nums[j];
                nums[j] = nums[j-1];
                nums[j-1] = temp;
                j--;
            }
        }

        System.out.println("The Element after Sorted are :");
        for(int i = 0 ; i < n ; i++){
            System.out.printf("%d ",nums[i]);
        } 
        System.out.println();
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        System.out.print("Enter the Size of the input array : ");
        n = sc.nextInt();
        System.out.print("Enter the Value to be stored in the array :");
        int[] arr = new int[n];
        for(int i = 0 ; i < n ; i++){
            arr[i] = sc.nextInt();
        }
        InsertionSort sol = new InsertionSort();
        sol.insertion(arr);
        sc.close();
    }
}
