import java.util.*;
import java.util.stream.*;

public class Main {

    public static void main(String[] args){

        Scanner in = new Scanner(System.in);
        int n = 9;
        int m = 9;

        int[][] matrixA = new int[n][m];
        
        int max = -1;
        int row = 0;
        int col = 0;
        for(int i=0; i <n; i++) {
            for(int j=0; j<m; j++) {
                matrixA[i][j] = in.nextInt();
                
                if(max < matrixA[i][j]) {
                    max = matrixA[i][j];
                    row = i + 1;
                    col = j + 1;
                }
            }
        }
        
        
        System.out.println(max);
        System.out.println(row + " " + col);
    }
}