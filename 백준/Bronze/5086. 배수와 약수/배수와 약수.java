import java.util.*;
import java.util.stream.*;

public class Main {
    
    public static void main(String[] args){

        Scanner in = new Scanner(System.in);
        
        while(true) {
            int a = in.nextInt();
            int b = in.nextInt();
            
            if (a == 0 && b == 0) {
                break;
            } else if(a == 0 || b == 0) {
                System.out.println("neither");
            } else if(b % a == 0) {
                System.out.println("factor");
            } else if(a % b == 0){
                System.out.println("multiple");
            } else {
                System.out.println("neither");
            }
        }

    }
}