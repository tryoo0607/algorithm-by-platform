import java.util.Scanner;

public class Main {
  public static void main(String[] args){
    Scanner in = new Scanner(System.in);
    int n = in.nextInt();
    int[] arr = new int[n];

    for (int i = 0; i < n; i++) {
        arr[i] = in.nextInt();
    }
      
    int v = in.nextInt();
    
    int count = 0;
    for(int num : arr) {
        if(v == num) count++;
    }
    
    System.out.println(count);
  }
}