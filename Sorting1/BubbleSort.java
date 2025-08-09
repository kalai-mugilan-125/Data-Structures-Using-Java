package Sorting1;
import java.util.*;

public class BubbleSort {

    void swapArr(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public int[] bubbleSort(int[] nums, int n) {
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (nums[j] > nums[j + 1]) {
                    swapArr(nums, j, j + 1);
                }
            }
        }
        return nums;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        System.out.print("Enter the Size of the Array: ");
        n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the value of elements in the array: ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        BubbleSort sol = new BubbleSort();
        int[] sortedArr = sol.bubbleSort(arr, n);
        System.out.print("Sorted Array: ");
        for (int i = 0; i < n; i++) {
            System.out.print(sortedArr[i] + " ");
        }
        System.out.println();
        sc.close();
    }
}
