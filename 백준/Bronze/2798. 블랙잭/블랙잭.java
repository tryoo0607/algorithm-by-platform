import java.util.*;

import java.util.stream.*;

import java.lang.Math;

public class Main {

    public static void main(String[] args){

        Scanner in = new Scanner(System.in);

        int n = in.nextInt();
        int m = in.nextInt();
        int[] cards = new int[n];
        
        for(int i = 0; i < n; i++) {
            cards[i] = in.nextInt();
        }
        
        int sum = 0;
        for(int i = 0; i < n - 2; i++) {
            for(int j = i + 1; j < n - 1; j++) {
                for(int k = j + 1; k < n; k++) {
                    int cardA = cards[i];
                    int cardB = cards[j];
                    int cardC = cards[k];
                    
                    int cardSum = cardA + cardB + cardC;
                    if(cardSum <= m && sum < cardSum) sum = cardSum;
                }
            }            
        }
        
        System.out.println(sum);
    }

} 