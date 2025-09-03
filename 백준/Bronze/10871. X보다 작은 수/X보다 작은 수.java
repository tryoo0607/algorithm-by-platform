import java.util.*;
import java.util.stream.Collectors;
import java.util.ArrayList;

public class Main {
  public static void main(String[] args){
    Scanner in = new Scanner(System.in);
    int n = in.nextInt();
    int x = in.nextInt();
      
    ArrayList<Integer> arr = new ArrayList<>();

    for (int i = 0; i < n; i++) {
        int num = in.nextInt();
        
        if (x > num) arr.add(num);
    }
      
    String result = arr.stream()
        .map(String::valueOf)           
        .collect(Collectors.joining(" ")); 
        
    System.out.println(result);
  }
}