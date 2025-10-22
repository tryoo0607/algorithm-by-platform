import java.util.*;

import java.util.stream.*;

import java.lang.Math;

public class Main {

    public static void main(String[] args){

        Scanner in = new Scanner(System.in);

        int n = in.nextInt();

        int max5Kilo = n/5;
        int minCount = -1;
        for(int i=0; i<=max5Kilo; i++) {
            
            int remain = n - 5*i;
            
            if(remain % 3 != 0) continue;
            
            int totalCount = i + (remain/3);
            
            if(minCount != -1) {
                minCount = Math.min(minCount, totalCount);
            } else {
                minCount = totalCount;
            }
        }

        System.out.println(minCount);
    }

} 