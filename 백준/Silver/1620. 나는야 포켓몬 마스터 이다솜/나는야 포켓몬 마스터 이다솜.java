import java.util.*;

import java.util.stream.*;

import java.lang.Math;

public class Main {

    public static void main(String[] args){

        Scanner in = new Scanner(System.in);

        int n = in.nextInt();
        int m = in.nextInt();
        
        Map<String, Integer> map = new HashMap<>();
        List<String> list = new ArrayList();

        for(int i=0; i<n; i++) {
            
            String str = in.next();
            
            map.put(str, i);
            list.add(str);
        }
        
        StringBuilder sb = new StringBuilder();
        for(int i=0; i<m; i++) {
            
            String str = in.next();
            
            if(str.matches("\\d+")) {
                sb.append(list.get(Integer.valueOf(str) - 1));
            } else {
                sb.append(map.get(str) + 1);
            }
            
            sb.append("\n");
        }
        

        System.out.println(sb.toString());
    }

} 