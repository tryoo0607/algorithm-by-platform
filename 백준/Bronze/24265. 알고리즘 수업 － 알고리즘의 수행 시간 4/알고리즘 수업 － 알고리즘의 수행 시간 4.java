import java.util.*;
import java.util.stream.*;
import java.lang.Math;

public class Main {
    
    public static void main(String[] args){

        Scanner in = new Scanner(System.in);
        long n = in.nextLong();
        
        long result = (long) ((n * (n - 1)) / 2);
        System.out.println(result);
        System.out.println(2);
    }
}