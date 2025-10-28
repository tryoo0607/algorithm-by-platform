import java.util.*;

import java.util.stream.*;

import java.lang.Math;

public class Main {

    public static void main(String[] args){

        Scanner in = new Scanner(System.in);

        String n = in.next();
        int len = n.length();

        Integer[] arr = new Integer[len];

        for(int i = 0; i < len; i++) {

            arr[i] = n.charAt(i) - '0';
        }

        Arrays.sort(arr, Comparator.reverseOrder());

        String result = Arrays.stream(arr)
            .map(String::valueOf)
            .collect(Collectors.joining(""));
        
        System.out.println(result);

    }

} 