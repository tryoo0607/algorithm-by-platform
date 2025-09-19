import java.util.*;
import java.util.stream.*;

public class Main {

    public static void main(String[] args){

        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int m = in.nextInt();

        int[][] matrixA = new int[n][m];
        
        for(int i=0; i <n; i++) {
            for(int j=0; j<m; j++) {
                matrixA[i][j] = in.nextInt();
            }
        }
        
        int[][] matrixB = new int[n][m];
        
        for(int i=0; i <n; i++) {
            for(int j=0; j<m; j++) {
                matrixB[i][j] = in.nextInt();
            }
        }
        
        int[][] resultMatrix = new int[n][m];
        
        for(int i=0; i <n; i++) {
            for(int j=0; j<m; j++) {
                resultMatrix[i][j] = matrixA[i][j] + matrixB[i][j];
            }
        }
        
        Arrays.stream(resultMatrix)
              .map(row -> Arrays.stream(row)
                                .mapToObj(String::valueOf)
                                .collect(Collectors.joining(" ")))
              .forEach(System.out::println);
        
    }
}