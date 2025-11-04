import java.util.*;

import java.util.stream.*;

import java.lang.Math;

public class Main {

    public static void main(String[] args){

        Scanner in = new Scanner(System.in);

        int n = in.nextInt();
        int m = in.nextInt();

        Set<String> set = new HashSet<>();

        for(int i=0; i<n; i++) {
            String str = in.next();
            set.add(str);
        }
        
        int count=0;
        for(int i=0; i<m; i++) {
            String str = in.next();
            
            if(set.contains(str)) count++;
        }

        System.out.println(count);
    }

} 