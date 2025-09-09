import java.util.Scanner;
import java.lang.Math;

public class Main {

    public static void main(String[] args){

        Scanner in = new Scanner(System.in);
        int n = in.nextInt();

        int[] arr = new int[n];

        int max = 0;
        for(int i = 0; i < n; i++) {
            int score = in.nextInt();
            max = Math.max(max, score);
            
            arr[i] = score;
        }


        double total = 0;
        for(int i = 0; i < n; i++) {
            total += ((double) arr[i]/max) * 100;
        }


        double result = total / n;
        System.out.println(result);
    }
}