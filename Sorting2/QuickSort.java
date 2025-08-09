package Sorting2;
import java.util.Scanner;

public class QuickSort{
    public void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
    public int Partition(int[] arr,int low,int high){
        int pivot = arr[low];
        int i = low;
        int j = high;
        while(i<j){
            while(i <= high - 1 && arr[i] <= pivot) i++;
            while(j >= low + 1 && arr[j] >= pivot) j--;
            if(i < j) swap(arr,i,j);
        }swap(arr, low, j);
        return j;
    }
    public void sort(int[] nums,int low, int high){
        if(low<high){
            int p = Partition(nums,low,high);
            sort(nums, low, p-1);
            sort(nums, p+1, high);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the Input Array:");
        int n = sc.nextInt();
        int[] nums = new int[n];
        System.out.println("Enter the input Array Elements :");
        for(int i = 0 ; i < n;i++){
            nums[i] = sc.nextInt();
        }
        QuickSort sol = new QuickSort();
        sol.sort(nums,0,nums.length-1);
        System.out.println("Sorted Array :");
        for(int num : nums){
            System.out.printf("%d ",num);
        }
        System.out.println();
        sc.close();

    }
}