import java.util.Scanner;
import java.lang.StringBuilder;

public class Main {
  public static void main(String[] args){
    Scanner in=new Scanner(System.in);
    int n = in.nextInt();
    
    int count = n / 4;
    StringBuilder builder = new StringBuilder("int");
        
    for(int i = 0; i < count; i++) {
        builder.insert(0, "long ");
    }

    System.out.println(builder.toString());
  }
}