package Sorting2;

import java.util.*;

public class MergeSort{
    public void merge(int[] arr,int low,int high, int mid){
        ArrayList<Integer> nums = new ArrayList<>();
        int left = low ;
        int right = mid+1;
        while(left <= mid && right <= high){
            if(arr[left] <= arr[right]){
                nums.add(arr[left]);
                left++;
            }
            else{
                nums.add(arr[right]);
                right++;
            }
        }
        while(left<=mid){
            nums.add(arr[left]);
            left++;
        }
        while(right <= high){
            nums.add(arr[right]);
            right++;
        }
        for(int i = low ;i<= high;i++){
            arr[i] = nums.get(i-low);
        }

    }
    public void mergeS(int[] nums,int low,int high){
       if(low >= high) return;
       int mid = (low + high)/2;
       mergeS(nums, low, mid);
       mergeS(nums, mid+1, high);
       merge(nums, low, high, mid);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n ;
        System.out.print("Enter the Size of the Array :");
        n = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0 ; i < n ;i++){
            arr[i] = sc.nextInt();
        }
        MergeSort sol = new MergeSort();
        sol.mergeS(arr,0,n-1);
        System.out.println("Sorted Array using merge sort:");
        for(int num : arr){
            System.out.print(num + " ");
        }
        System.out.println();
        sc.close();
    }
}