import java.util.*;

import java.util.stream.*;

import java.lang.Math;

public class Main {

    public static void main(String[] args){

        Scanner in = new Scanner(System.in);

        int a = in.nextInt();
        int b = in.nextInt();
        int c = in.nextInt();
        int d = in.nextInt();
        int e = in.nextInt();
        int f = in.nextInt();

        int resultX = 1000;
        int resultY = 1000;
        for(int x = -999; x <= 999; x++) {
            for(int y= -999; y<= 999; y++) {
                int exepA = a*x + b*y;
                int exepB = d*x + e*y;
                
                if(exepA == c && exepB == f) {
                    resultX = x;
                    resultY = y;
                    break;
                }
            }
        }
        
        System.out.println(resultX + " " + resultY);
    }

} 