import java.util.Scanner;
import java.lang.Math;

public class Main {

    public static void main(String[] args){

        Scanner in = new Scanner(System.in);
        String num1Str = in.next();
        String num2Str = in.next();

        StringBuilder builder1 = new StringBuilder(num1Str);
        StringBuilder builder2 = new StringBuilder(num2Str);
        
        int num1 = Integer.parseInt(builder1.reverse().toString());
        int num2 = Integer.parseInt(builder2.reverse().toString());
        System.out.println(Math.max(num1, num2));
    }
}