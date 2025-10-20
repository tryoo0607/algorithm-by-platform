import java.util.*;

import java.util.stream.*;

import java.lang.Math;

public class Main {
    
    public static int checkChanges(int[][] board, int i, int j, int first) {
        int totalChange = 0;

        int second = first == 1 ? 0 : 1;

        for(int a = i; a < i + 8; a++) {
            for(int b = j; b < j + 8; b++) {

                if(a % 2 == 0) {
                    if(b % 2 == 0) {
                        if(board[a][b] != first) totalChange++;
                    } else {
                        if(board[a][b] != second) totalChange++;
                    }
                } else {
                    if(b % 2 == 0) {
                        if(board[a][b] != second) totalChange++;
                    } else {
                        if(board[a][b] != first) totalChange++;
                    }
                }
            }   
        }
        
        return totalChange;
    }
    

    public static void main(String[] args){

        Scanner in = new Scanner(System.in);

        int n = in.nextInt();
        int m = in.nextInt();

        int[][] board = new int[n][m];
        
        for(int i=0; i<n; i++) {
            String line = in.next();
            for(int j=0; j<m; j++) {
               char item = line.charAt(j);
               board[i][j] = item == 'W' ? 1 : 0;
            }
        }

        int result = n*m;
        for(int i=0; i<=n - 8; i++) {
            for(int j=0; j<=m - 8; j++) {
           
                int caseW = checkChanges(board, i, j, 1);
                int caseB = checkChanges(board, i, j, 0);
                
                int minCase = Math.min(caseW, caseB);
                result = Math.min(result, minCase);
            }
        }
        
        System.out.println(result);
    }

} 