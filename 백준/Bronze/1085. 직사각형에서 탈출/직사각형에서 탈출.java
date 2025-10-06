import java.util.*;
import java.util.stream.*;
import java.lang.Math;

public class Main {
    
    public static void main(String[] args){

        Scanner in = new Scanner(System.in);
        int x = in.nextInt();
        int y = in.nextInt();
        int w = in.nextInt();
        int h = in.nextInt();

        int moveX = w - x < x ? w - x : x;
        int moveY = h - y < y ? h - y : y;
        int result = Math.min(moveX, moveY);
        
        System.out.println(result);
    }
}