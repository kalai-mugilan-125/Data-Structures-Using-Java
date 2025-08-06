import java.util.*;
public class MaxFreqAfterK{
    public int maxFreq(int[] nums,int k){
        Arrays.sort(nums);
        int l =0 ;
        long total = 0;
        int maxF = 0;
        for(int r = 0 ; r < nums.length ; r++){
            total += nums[r];
            while((long)nums[r]*(r-l+1) > total+k){
                total -= nums[l];
                l++;
            }
            maxF = Math.max(maxF,(r-l+1));
        }
        return maxF;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n;
        System.out.print("Enter the input size of the array: ");
        n = sc.nextInt();
        sc.nextLine();
        int[] arr = new int[n];
        System.out.print("Enter the elements of the array :");
        for(int i = 0 ; i < n ; i++){
            arr[i] = sc.nextInt();
        }
        int k ;
        System.out.print("Enter the number of opeations to be performed ");
        k = sc.nextInt();
        MaxFreqAfterK sol = new MaxFreqAfterK();
        int x = sol.maxFreq(arr, k);
        System.out.println("The Maximum Frequency that can be Obtained after K operations is "+x);
        sc.close();

    }
}