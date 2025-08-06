import java.util.*;
public class HLFreq {
    public void findMaxMin(HashMap<Integer,Integer> mp){
        int minValue = Integer.MAX_VALUE;
        int maxValue = Integer.MIN_VALUE;
        int x = 0,y = 0;
        for(Map.Entry<Integer,Integer> entry : mp.entrySet()){
            maxValue = Math.max(maxValue,entry.getValue());
            if(maxValue == entry.getValue()) x = entry.getKey();
            minValue = Math.min(minValue,entry.getValue());
            if(minValue == entry.getValue()) y = entry.getKey();
        }
        System.out.printf("Maximum Frequency Element %d\nMinimum Frequency Element %d\n",x,y);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n ;
        System.out.print("Enter the Size of the Array:");
        n = sc.nextInt();
        HashMap<Integer,Integer> mp = new HashMap<>();
        for(int i = 0 ; i < n ; i++){
            int x = 1;
            int y = sc.nextInt();
            if(mp.containsKey(y)) x = mp.get(y);
            x++;
            mp.put(y,x);
        }
        HLFreq sol = new HLFreq();
        sol.findMaxMin(mp);
        sc.close();
    }
}
