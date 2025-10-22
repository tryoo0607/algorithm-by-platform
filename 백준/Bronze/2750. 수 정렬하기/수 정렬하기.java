import java.util.*;

import java.util.stream.*;

import java.lang.Math;

public class Main {

    public static void main(String[] args){

        Scanner in = new Scanner(System.in);

        int n = in.nextInt();
        
        List<Integer> arr = new ArrayList<>();

        for(int i=0; i < n; i++) {
            arr.add(in.nextInt());
        }

        arr.sort(Comparator.naturalOrder());

        for(Integer num : arr) {
            
            System.out.println(num);
        }
    }

} 