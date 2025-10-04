import java.util.*;
import java.util.stream.*;

public class Main {
    
    public static void main(String[] args){

        Scanner in = new Scanner(System.in);
        
        int m = in.nextInt();
        int n = in.nextInt();

        
        int sum = 0;
        int min = 10000;
        for(int i=m; i <=n; i++) {
            
            boolean isPrime = true;
            
            if(i == 1) {
                isPrime = false;
            } else {
                for(int j=2; j < i; j++) {
                    if(i % j == 0) {
                        isPrime = false;
                        break;
                    }
                }
            }
            
            if(!isPrime) continue;
            
            sum += i;
            min = Math.min(i, min);
        }
        
        if(sum == 0) {
            System.out.println(-1);
        } else {
            System.out.println(sum);
            System.out.println(min);
        }
       
    }
}