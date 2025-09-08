import java.util.Scanner;

public class Main {

  public static void main(String[] args){

    Scanner in = new Scanner(System.in);

    int line=10;
    int num=42;
      
    int[] list = new int[num];

    for (int a = 0; a < line; a++) {
        int i = in.nextInt();
        int remain = i % 42;
        list[remain] = 1;
    }
    
    int count=0;
    for (int b = 0; b < num; b++) {
        if(list[b] == 1) count++;
    }

    System.out.println(count);
  }

}