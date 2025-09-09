import java.util.Scanner;
import java.util.Arrays;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args){

        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int m = in.nextInt();

        int[] bucket = new int[n];

        for(int a = 1; a <= n; a++) {
            bucket[a - 1] = a;
        }

        for (int b = 0; b < m; b++) {
            int idxI = in.nextInt() - 1;
            int idxJ = in.nextInt() - 1;

            int differ = (idxJ - idxI) / 2;
            for(int c = 0; c <= differ; c++) {
                int start = idxI + c;
                int end = idxJ - c;

                if(start == end) continue; 
                int tmp = bucket[start];
                bucket[start] = bucket[end];
                bucket[end] = tmp;
            }
        }

        String result = Arrays.stream(bucket)
            .mapToObj(String::valueOf)
            .collect(Collectors.joining(" "));

        System.out.println(result);
    }
}