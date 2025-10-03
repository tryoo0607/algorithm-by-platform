import java.util.*;
import java.util.stream.*;

public class Main {
    
    public static void main(String[] args){

        Scanner in = new Scanner(System.in);
        
        int n = in.nextInt();
        
        int count = 0;
        for(int i=0; i < n; i++) {
            int num = in.nextInt();
            
            boolean isPrime = true;
            
            if(num == 1) {
                isPrime = false;
            } else {
                for(int j=2; j < num; j++) {
                    if(num % j == 0) {
                        isPrime = false;
                        break;
                    }
                }
            }

            if(isPrime) count++;
        }
        
        System.out.println(count);
    }
}