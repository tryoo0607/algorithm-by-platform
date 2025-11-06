import java.util.*;

import java.util.stream.*;

import java.lang.Math;

public class Main {

    public static void main(String[] args){

        Scanner in = new Scanner(System.in);

        int n = in.nextInt();
        
        Map<String, String> map = new HashMap<>();

        for(int i=0; i<n; i++) {
            String name = in.next();
            String act = in.next();
            
            if(act.equals("enter")) {
                map.put(name, act);
            } else if(map.containsKey(name) && act.equals("leave")) {
                map.remove(name);
            }
        }
        
        List<String> keyList = new ArrayList<>(map.keySet());
        Collections.sort(keyList, Collections.reverseOrder());
        
        StringBuilder sb = new StringBuilder();
        for(String key : keyList) {
            sb.append(key)
              .append("\n");
        }

        System.out.println(sb.toString());
    }

} 