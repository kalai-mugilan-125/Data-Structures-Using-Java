package Sort;

import java.util.*;

public class SelectionSort{
    public int[] nums(int[] arr,int n){
        for(int i = 0 ; i < n-1;i++){
            int minInd = i;
            for(int j = i ; j < n ; j++){
                if(arr[j] < arr[minInd]){
                    minInd = j;
                }
            }
            if(minInd != i){
                int temp = arr[i];
                arr[i] = arr[minInd];
                arr[minInd] = temp;
            }
        }
        return arr;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        System.out.print("Enter the Size of the Array : ");
        n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the value of elements in the array : ");
        for(int i = 0 ; i < n ; i++){
            arr[i] = sc.nextInt();
        }
        int[] sortedArr = new int[n];
        SelectionSort sol = new SelectionSort();
        sortedArr = sol.nums(arr,n);
        System.out.print("Sorted Array : ");
        for(int i = 0; i < n ; i++){
            System.out.print(sortedArr[i] + " ");
        }
        System.out.println();

        sc.close();
    }
}