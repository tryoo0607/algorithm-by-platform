import java.util.*;
import java.util.stream.*;

public class Main {
    
    public static void main(String[] args){

        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        
        int total = 1;
        int count = 1;
        while(total < n) {
            count++;
            total += 6 * (count - 1);

        }
        
        System.out.println(count);
    }
}