import java.util.*;

import java.util.stream.*;

import java.lang.Math;

public class Main {

    public static void main(String[] args){

        Scanner in = new Scanner(System.in);

        long n = in.nextLong();
        
        // n개 중 겹치지 않게 3개 고르는 로직 -> nCr 공식 사용
        long result = (n * (n - 1) * (n - 2)) / 6;

        System.out.println(result);

        System.out.println(3);

    }

} 