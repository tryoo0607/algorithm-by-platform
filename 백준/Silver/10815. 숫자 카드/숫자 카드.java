import java.util.*;

import java.util.stream.*;

import java.lang.Math;

public class Main {

    public static void main(String[] args){

        Scanner in = new Scanner(System.in);

        int n = in.nextInt();

        Set<Integer> set = new HashSet<>();

        for(int i=0; i<n; i++) {
            int num = in.nextInt();
            set.add(num);
        }
        
        int m = in.nextInt();

        StringBuilder builder = new StringBuilder();

        for(int i=0; i<m; i++) {
            int num = in.nextInt();
            
            int result = set.contains(num) ? 1 : 0;
            builder.append(result)
                .append(" ");

        }

        System.out.println(builder.toString());
    }

} 