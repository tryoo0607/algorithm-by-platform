import java.util.*;
import java.util.stream.*;

public class Main {

    public static void main(String[] args){

        Scanner in = new Scanner(System.in);
        int n = 5;
        int m = 15;

        Character[][] matrix = new Character[n][m];
        
        for(int i=0; i <n; i++) {
            String str = in.nextLine();
            
            for(int j=0; j < str.length(); j++) {
                matrix[i][j] = str.charAt(j);
            }
        }
        
        StringBuilder builder = new StringBuilder();
        for(int i=0; i <m; i++) {
            for(int j=0; j<n; j++) {
                
                Character target = matrix[j][i];
                if(target != null) builder.append(target); 
            }
        }
        
        
        System.out.println(builder.toString());
    }
}