import java.util.*;

public class Main {
  public static void main(String[] args){
    Scanner in = new Scanner(System.in);
    int n = in.nextInt();
      
    int[] nums = new int[n];

    for (int i = 0; i < n; i++) {
        nums[i] = in.nextInt();
    }
      
    int min = Arrays.stream(nums).min().getAsInt();
    int max = Arrays.stream(nums).max().getAsInt();
        
    System.out.println(min + " " + max);
  }
}