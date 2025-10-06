import java.util.*;
import java.util.stream.*;
import java.lang.Math;

public class Main {
    
    public static void main(String[] args){

        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        
        int minX = 100000;
        int minY = 100000;
        int maxX = -100000;
        int maxY = -100000;
        
        for(int i=0; i<n; i++) {
            int x = in.nextInt();
            int y = in.nextInt();
            
            if(x <= minX) {
                minX = x;
            }
            
            if(x >= maxX) {
                maxX = x;
            }
            
            if(y <= minY) {
                minY = y;
            }
            
            if(y >= maxY) {
                maxY = y;
            }
        }
        
        int resultX = maxX - minX;
        int resultY = maxY - minY;
        System.out.println(resultX * resultY);;
    }
}