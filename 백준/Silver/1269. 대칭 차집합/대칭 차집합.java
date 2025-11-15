import java.util.*;

import java.util.stream.*;

import java.lang.Math;

public class Main {

    public static void main(String[] args){

        Scanner in = new Scanner(System.in);

        int n = in.nextInt();

        int m = in.nextInt();

        Set<Integer> setA = new HashSet<>();

        for(int i=0; i<n; i++) {

            int num = in.nextInt();

            setA.add(num);
        }

        Set<Integer> setB = new HashSet<>();
        for(int i=0; i<m; i++) {

            int num = in.nextInt();

            setB.add(num);
        }

        int count = 0;
        for(int num : setA) {

            if(setB.contains(num)) count++;
        }
        
       int countA = n - count;
       int countB = m - count;
        
       System.out.println(countA + countB);
    }

} 