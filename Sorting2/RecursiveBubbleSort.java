package Sorting2;
import java.util.Scanner;
public class RecursiveBubbleSort{
    public void sort(int[] nums,int n){
        if(n == 1) return ;
        boolean isSwapped = false;
        for(int j = 0 ; j < n-1;j++){
            if(nums[j] >= nums[j+1]){
                int temp = nums[j];
                nums[j] = nums[j+1];
                nums[j+1] = temp;
                isSwapped = true;
            }
        }
        if(!isSwapped) return;
        sort(nums, n-1);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        System.out.print("Enter the size of the Input Array :");
        n = sc.nextInt();
        int[] arr =  new int[n];
        System.out.println("Enter the Input Elements of the Array");
        for(int i = 0 ; i < n ; i++){
            arr[i] = sc.nextInt();
        }
        RecursiveBubbleSort sol = new RecursiveBubbleSort();
        sol.sort(arr, n);
        System.out.println("Sorted Elements:");
        for(int num : arr){
            System.out.printf("%d ",num);
        }
        System.out.println();
        sc.close();
    }
}