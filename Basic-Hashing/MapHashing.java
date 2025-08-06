import java.util.*;

public class MapHashing {
    public void printFreq(HashMap<Integer,Integer> mp, int n, int[] arr){
        for(Map.Entry<Integer,Integer> entry : mp.entrySet()){
            System.out.println("The frequency of the term "+entry.getKey()+" is "+entry.getValue());
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        System.out.print("Enter the Size of the input Array:");
        n = sc.nextInt();
        System.out.println("Enter the input terms: ");
        int[] arr = new int[n];
        for(int i = 0 ; i < n;i++){
            arr[i] = sc.nextInt();
        }
        sc.nextLine();
        HashMap<Integer,Integer> mp = new HashMap<>();
        for(int i = 0 ; i < n ;i++){
            int a = arr[i];
            int freq = 0;
            if(mp.containsKey(a)) freq = mp.get(a);
            freq++;
            mp.put(a,freq);
        }
        MapHashing sol = new MapHashing();
        sol.printFreq(mp, n, arr);
        sc.close();
    }
}
