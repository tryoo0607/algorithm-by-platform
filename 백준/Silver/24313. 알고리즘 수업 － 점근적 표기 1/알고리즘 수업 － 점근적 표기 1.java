import java.util.*;

import java.util.stream.*;

import java.lang.Math;

public class Main {

    public static void main(String[] args){

        Scanner in = new Scanner(System.in);

        int a1 = in.nextInt();
        int a0 = in.nextInt();
        
        int c = in.nextInt();
        int n0 = in.nextInt();
        
        int result = 1;
        
        for(int n = n0; n<=100; n++) {
           if (a1 * n + a0 > c * n) {
                result = 0;
                break;
            }
        }

        System.out.println(result);
    }

} 