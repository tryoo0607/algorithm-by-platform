import java.util.Scanner;
import java.util.Arrays;
import java.util.stream.Collectors;

public class Main {

  public static void main(String[] args){

    Scanner in = new Scanner(System.in);

    int[] list = new int[30];

    for (int a = 0; a < 28; a++) {
        int i = in.nextInt() - 1;
        list[i] = 1;
    }
      
    for (int b = 0; b < 30; b++) {
        if(list[b] != 1) System.out.println(b + 1);
    }

  }

}