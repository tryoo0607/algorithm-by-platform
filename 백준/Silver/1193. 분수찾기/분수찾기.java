import java.util.*;
import java.util.stream.*;

public class Main {
    
    public static void main(String[] args){

        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        
        int count = 1;
        int target = 0;
        while(true) {
            int before = (int)((count) * (count -1) * 0.5);    
            int total = (int)((count+1) * count * 0.5);
            
            if(total >= n) {
                target = n - before;
                break;
            } else {
                count++;
            }
        }
        
        int decrease = (count + 1) - target;
        int increase = target;
        
        String result = count % 2 == 0 ? increase + "/" + decrease : decrease + "/" + increase;
        
        System.out.println(result);
    }
}