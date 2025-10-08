import java.util.*;
import java.util.stream.*;
import java.lang.Math;

public class Main {
    
    public static void main(String[] args){

        Scanner in = new Scanner(System.in);

        while(true) {
            int sideA = in.nextInt();
            int sideB = in.nextInt();
            int sideC = in.nextInt();
            
            if(sideA == 0 && sideB == 0 && sideC == 0) break;

            String result = "";
            
            if(
                sideA >= sideB + sideC
                || sideB >= sideC + sideA
                || sideC >= sideB + sideA 
            ) {
                result = "Invalid";
            } else if(
                sideA == sideB
                && sideB == sideC
                && sideC == sideA
            ) {
                result = "Equilateral";
            } else if(
                sideA == sideB
                || sideB == sideC
                || sideC == sideA
            ) {
                result = "Isosceles";
            } else if(
                sideA != sideB
                && sideB != sideC
                && sideC != sideA
            )  {
                result = "Scalene";
            }

            System.out.println(result);
        }
    }
}