import java.util.*;

import java.util.stream.*;

import java.lang.Math;

public class Main {

    public static void main(String[] args){

        Scanner in = new Scanner(System.in);

        long n = in.nextLong();

        int result = 0;
        for(int i=1; i<=n; i++) {
            
            long sum = i;
            long target = i;
            while(target > 0) {
                int num = (int) (target % 10);
                sum += num;
                target = target / 10;
            }
            
            if(sum == n) {
                result = i;
                break;
            }
        }
        
        System.out.println(result);
    }

} 