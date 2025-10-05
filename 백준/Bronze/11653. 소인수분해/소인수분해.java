import java.util.*;
import java.util.stream.*;

public class Main {
    
    public static void main(String[] args){

        Scanner in = new Scanner(System.in);
        int n = in.nextInt();

        int num = n;
        while(num > 1) {
            
            int target = 0;
            for(int i=2; i <= num; i++) {
                if(num % i == 0) {
                    num = num / i;
                    target = i;
                    break;
                }    
            }
            
            System.out.println(target);   
        }     
    }
}