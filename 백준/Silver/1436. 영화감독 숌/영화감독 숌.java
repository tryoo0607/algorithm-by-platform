import java.util.*;

import java.util.stream.*;

import java.lang.Math;

public class Main {

    public static void main(String[] args){

        Scanner in = new Scanner(System.in);

        int n = in.nextInt();

        int count = 0;
        int num = 666;
        while(true) {
            String str = String.valueOf(num);
            
            if(str.contains("666")) count++;
            
            if(n == count) {
                break;
            } else {
                num++;
            }
        }
        
        System.out.println(num);
    }

} 