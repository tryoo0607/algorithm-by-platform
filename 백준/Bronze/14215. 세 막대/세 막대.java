import java.util.*;
import java.util.stream.*;
import java.lang.Math;

public class Main {
    
    public static void main(String[] args){

        Scanner in = new Scanner(System.in);

        int sideA = in.nextInt();
        int sideB = in.nextInt();
        int sideC = in.nextInt();
        
        int[] arr = {sideA, sideB, sideC};
        Arrays.sort(arr);
        
        
        if(arr[0] + arr[1] <= arr[2]) {
            arr[2] = arr[0] + arr[1] - 1;
        }
        
        System.out.println(arr[0] + arr[1] + arr[2]);
    }
}