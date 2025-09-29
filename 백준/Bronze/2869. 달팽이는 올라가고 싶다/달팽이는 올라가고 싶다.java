import java.util.*;
import java.util.stream.*;

public class Main {
    
    public static void main(String[] args){

        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();
        int v = in.nextInt();
        
        int result = (int)Math.ceil((double)(v - a)/(a - b)) + 1;
              
        System.out.println(result);
    }
}