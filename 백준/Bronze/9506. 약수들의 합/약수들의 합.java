import java.util.*;
import java.util.stream.*;

public class Main {
    
    public static void main(String[] args){

        Scanner in = new Scanner(System.in);
        
        while(true) {
            int num = in.nextInt();
            
            if(num == -1) break;
            
            List<Integer> list = new ArrayList();

            for(int i = 1; i < num; i++) {

                if(num % i == 0) list.add(i);
            }
            
            int total = list.stream()
                .mapToInt(Integer::intValue)
                .sum();
            
            if(num == total) {
                String sum = list.stream()
                    .map(String::valueOf)
                    .collect(Collectors.joining(" + "));
                System.out.println(num + " = " + sum);
            } else {
                System.out.println(num + " is NOT perfect.");
            }
        }
    }
}