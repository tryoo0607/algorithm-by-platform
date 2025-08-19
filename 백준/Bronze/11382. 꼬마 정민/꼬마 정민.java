import java.util.Scanner;

public class Main {
  public static void main(String[] args){
    Scanner in=new Scanner(System.in);
    String str = in.nextLine();
    String[] strSplit = str.split(" ");
    
    long sum = 0;
    for(String s : strSplit) {
        long i = Long.parseLong(s);
        sum += i;
    }
      
    System.out.println(sum);
  }
}