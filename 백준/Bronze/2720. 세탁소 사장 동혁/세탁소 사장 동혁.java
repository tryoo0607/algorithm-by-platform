import java.util.*;
import java.util.stream.*;

public class Main {
    
    public static void printCoins(int change) {
        int nums = 4;        
        int[] coins = {25, 10, 05, 01};
        int[] counts = new int[nums];
        
        int remain = change;
        for(int i=0; i < nums; i++) {
            counts[i] = remain / coins[i];
            remain = remain % coins[i];
        }
        
        String result = Arrays.stream(counts)
            .mapToObj(String::valueOf)
            .collect(Collectors.joining(" "));
        
        System.out.println(result);
    }
   

    public static void main(String[] args){

        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        
        for(int i=0; i < n; i++) {
            int change = in.nextInt();
            printCoins(change);
        }
    }
}