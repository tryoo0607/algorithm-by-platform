import java.util.*;
import java.util.stream.*;

public class Main {
    
    public static void main(String[] args){

        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        
        double base = Math.pow(2, n) + 1;
        double result = Math.pow(base, 2);

        System.out.println((int) result);
    }
}