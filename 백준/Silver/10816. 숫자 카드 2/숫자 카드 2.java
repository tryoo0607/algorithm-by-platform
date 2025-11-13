import java.util.*;

import java.util.stream.*;

import java.lang.Math;

public class Main {

    public static void main(String[] args){

        Scanner in = new Scanner(System.in);

        int n = in.nextInt();
        
        Map<Integer, Integer> map = new HashMap<>();

        for(int i=0; i<n; i++) {
            
            int num = in.nextInt();   
            int value = map.getOrDefault(num, 0);
            
            map.put(num, value + 1);
        }
        
        
        int m = in.nextInt();
        StringBuilder sb = new StringBuilder();
        for(int i=0; i<m; i++) {
            
            int num = in.nextInt();
            int count = map.getOrDefault(num, 0);
                
            sb.append(count)
                .append("\n");
        }

        System.out.println(sb.toString());
    }

} 