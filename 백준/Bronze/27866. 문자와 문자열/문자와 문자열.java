import java.util.Scanner;
import java.lang.Math;

public class Main {

    public static void main(String[] args){

        Scanner in = new Scanner(System.in);
        String str = in.next();
        int i = in.nextInt();

        System.out.println(str.charAt(i - 1));
    }
}