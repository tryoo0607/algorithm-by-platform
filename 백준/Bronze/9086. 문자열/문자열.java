import java.util.Scanner;
import java.lang.Math;

public class Main {

    public static void main(String[] args){

        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        
        for(int i=0; i < t; i++) {
            String str = in.next();
            int len = str.length();
            int last = len - 1;
            
            System.out.println(str.charAt(0) + "" + str.charAt(last));
        }
    }
}