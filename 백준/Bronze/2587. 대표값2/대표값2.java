import java.util.*;

import java.util.stream.*;

import java.lang.Math;

public class Main {

    public static void main(String[] args){

        Scanner in = new Scanner(System.in);
        
        List<Integer> arr = new ArrayList<>();

        for(int i=0; i < 5; i++) {
            arr.add(in.nextInt());
        }

        arr.sort(Comparator.naturalOrder());

        int sum = arr.stream()
            .mapToInt(Integer::intValue)
            .sum();
        
        int avg = sum / 5;
        int mid = arr.get(2);
        
        System.out.println(avg);
        System.out.println(mid);
    }

} 