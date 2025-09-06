import java.util.Scanner;
import java.util.Arrays;
import java.util.stream.Collectors;

public class Main {

  public static void main(String[] args){

    Scanner in = new Scanner(System.in);

    int n = in.nextInt();
    int m = in.nextInt();

    int[] bucket = new int[n];

    for (int a = 0; a < n; a++) {
        bucket[a] = a + 1;
    }
      
    for(int b=0; b < m; b++) {
        int i = in.nextInt() - 1;
        int j = in.nextInt() - 1;
        
        int tmp = bucket[i];
        bucket[i] = bucket[j];
        bucket[j] = tmp;
    }

    String result = Arrays.stream(bucket)
        .mapToObj(String::valueOf)
        .collect(Collectors.joining(" "));

    System.out.println(result);
  }

}