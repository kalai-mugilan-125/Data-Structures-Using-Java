package Sorting2;
import java.util.Scanner;

public class RecursiveInsertionSort{
    public void sort(int[] nums, int start){
        if(start >= nums.length-1) return;
        int minInd = start;
        for(int i = start; i < nums.length;i++){
            if(nums[i] < nums[minInd]){
                minInd = i;
            }       
        }
        int temp = nums[start];
        nums[start] = nums[minInd];
        nums[minInd] = temp;
        sort(nums, start+1);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Input Array Size :");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the Elements of Input Array");
        for(int i = 0 ; i < n ; i++){
            arr[i] = sc.nextInt();
        }
        RecursiveInsertionSort sol = new RecursiveInsertionSort();
        sol.sort(arr, 0);
        System.out.println("Sorted Array:");
        for(int num : arr){
            System.out.printf("%d ",num);
        }
        System.out.println();
        sc.close();
    }
}