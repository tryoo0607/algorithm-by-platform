import java.util.*;

import java.util.stream.*;

import java.lang.Math;

public class Main {

    public static void main(String[] args){

        Scanner in = new Scanner(System.in);

        int n = in.nextInt();
        
        List<Integer[]> grid = new ArrayList<>();
        for(int i=0; i<n; i++) {
            int x = in.nextInt();
            int y = in.nextInt();
            
            grid.add(new Integer[]{x, y});
        }
        
        grid.sort((a, b) -> {
            if (!a[1].equals(b[1])) {
                return a[1] - b[1];
            } else {
                return a[0] - b[0];
            }
        });

        StringBuilder builder = new StringBuilder();
        for(Integer[] nums : grid) {
            
            builder.append(nums[0]);
            builder.append(" ");    
            builder.append(nums[1]);
            builder.append("\n");
        }
        
        System.out.println(builder.toString());
    }

} 