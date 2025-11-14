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

            String name = in.next();

            set.add(name);
        }

        List<String> list = new ArrayList<>();
        for(int i=0; i<m; i++) {

            String name = in.next();

            if(set.contains(name)) {
                
                list.add(name);
            }
        }
        
        StringBuilder sb = new StringBuilder();
        
        sb.append(list.size())
            .append("\n");
        
        Collections.sort(list);
        for(String name : list) {
            
            sb.append(name)
                .append("\n");
        }

        System.out.println(sb.toString());

    }

} 