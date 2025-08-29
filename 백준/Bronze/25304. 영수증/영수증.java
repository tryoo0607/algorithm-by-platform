import java.util.Scanner;

public class Main {
  public static void main(String[] args){
    Scanner in=new Scanner(System.in);
    long total = in.nextLong();
    int n = in.nextInt();
    
    long sum = 0;
    for(int i = 0; i < n; i++) {
        long price = in.nextLong();
        int count = in.nextInt();
        
        sum += price*count;
    }
    
    String result = (total == sum) ? "Yes" : "No";
    System.out.println(result);
  }
}