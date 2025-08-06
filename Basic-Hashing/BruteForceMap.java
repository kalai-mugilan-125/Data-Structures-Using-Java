import java.util.Scanner;
public class BruteForceMap {

    public void arr(int nums[],int n){  
        boolean[] visited = new boolean[n];
        for(int i = 0 ; i < n ; i++){
            if(visited[i] == true){
                continue;
            }
            int count  = 1;

            for(int j = i + 1 ; j < n ; j++){
                if(nums[i] == nums[j]){
                    visited[j] = true;
                    count++;
                }
            }
            System.out.println("The term "+nums[i]+ " has a frequency of "+ count);
        }
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n ;
    
        System.out.println("Enter the size of the input array");
        n = sc.nextInt();
        sc.nextLine();
        int[] arr =  new int[n];
        System.out.println("Enter the input Elements :");
        for(int i = 0 ; i < n ; i++){
            arr[i] =  sc.nextInt();
        }
        BruteForceMap sol = new BruteForceMap();
        sol.arr(arr, n);
        sc.close();
    }
    
}
