import java.util.*;
import java.util.stream.*;

public class Main {

    public static void main(String[] args){

        Scanner in = new Scanner(System.in);
        int length = 100;
        int count = in.nextInt();

        int[][] matrix = new int[length][length];
        
        for(int i=0; i <count; i++) {
            int idxX = in.nextInt() - 1;
            int idxY = in.nextInt() - 1;
            
            for(int j=idxY; j < idxY + 10; j++) {
                Arrays.fill(matrix[j], idxX, idxX+10, 1);
            }
        }
        
        int total = Arrays.stream(matrix)
                        .mapToInt(row -> Arrays.stream(row).sum())
                        .sum();
        
        System.out.println(total);
    }
}