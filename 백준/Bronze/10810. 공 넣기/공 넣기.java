import java.util.Scanner;
import java.util.Arrays;
import java.util.stream.Collectors;

public class Main {

  public static void main(String[] args){

    Scanner in = new Scanner(System.in);

    int n = in.nextInt();
    int m = in.nextInt();

    int[] bucket = new int[n];

    for (int a = 0; a < m; a++) {
        int i = in.nextInt();
        int j = in.nextInt();
        int k = in.nextInt();

        Arrays.fill(bucket, i - 1, j, k);
    }

    String result = Arrays.stream(bucket)
        .mapToObj(String::valueOf)
        .collect(Collectors.joining(" "));

    System.out.println(result);
  }

}