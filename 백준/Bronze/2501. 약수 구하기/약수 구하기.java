import java.util.*;
import java.util.stream.*;

public class Main {
    
    public static void main(String[] args){

        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int k = in.nextInt();
        
        
        List<Integer> list = new ArrayList();
        
        for(int i = 1; i <= n; i++) {
            
            if(n % i == 0) list.add(i);
        }

        int target = (k > list.size()) ? 0 : list.get(k - 1);
        System.out.println(target);
    }
}