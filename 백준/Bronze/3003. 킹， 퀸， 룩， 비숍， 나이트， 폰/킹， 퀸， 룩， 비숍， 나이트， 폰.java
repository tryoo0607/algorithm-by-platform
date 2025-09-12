import java.util.Scanner;
import java.util.Arrays;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args){

        Scanner in = new Scanner(System.in);
        int[] pices = new int[6];

        int[] sample = {1, 1, 2, 2, 2, 8};
        for(int i=0; i < 6; i++) {
            int count = in.nextInt();
            int differ = sample[i] - count;

            pices[i] = differ;
        }

        String result = Arrays.stream(pices)
            .mapToObj(String::valueOf)
            .collect(Collectors.joining(" "));

        System.out.println(result);
    }
}