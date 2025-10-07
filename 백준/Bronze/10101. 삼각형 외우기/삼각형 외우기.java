import java.util.*;
import java.util.stream.*;
import java.lang.Math;

public class Main {
    
    public static void main(String[] args){

        Scanner in = new Scanner(System.in);
        int angleA = in.nextInt();
        int angleB = in.nextInt();
        int angleC = in.nextInt();
        
        String result = "";
        if(angleA == 60 && angleB == 60 && angleC == 60) {
            result = "Equilateral";
        } else if(angleA + angleB + angleC == 180 && (
            angleA == angleB
            || angleB == angleC
            || angleC == angleA
        )) {
            result = "Isosceles";
        } else if(angleA + angleB + angleC == 180 && (
            angleA != angleB
            && angleB != angleC
            && angleC != angleA
        ))  {
            result = "Scalene";
        } else {
            result = "Error";
        }
        
        System.out.println(result);
    }
}