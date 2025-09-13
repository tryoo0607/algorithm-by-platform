import java.util.Scanner;
import java.util.Arrays;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args){

        Scanner in = new Scanner(System.in);
        int n = in.nextInt();

        int max = n * 2 - 1;
        for(int i=1; i<n*2; i++) {                            

            // 현재 줄의 단계
            int level = i <= n ? i : (2*n - i);
            
            // 별의 수
            int star = (level * 2) - 1;
            
            // 공백의 수
            int blank = (max - star) / 2;
            
            StringBuilder builder = new StringBuilder();
            for(int j=1; j<=blank; j++) {

                builder.append(" ");
            }

            for(int j=1; j<=star; j++) {

                builder.append("*");
            }
            System.out.println(builder.toString());
        }
    }
}