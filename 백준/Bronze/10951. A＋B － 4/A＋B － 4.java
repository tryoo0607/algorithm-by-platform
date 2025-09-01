import java.util.Scanner;

public class Main {
  public static void main(String[] args){
    Scanner in=new Scanner(System.in);
    while(true) {
        Integer a;
        Integer b;
        
        try {
            a = in.nextInt();
            b = in.nextInt();
        } catch(Exception e) {
            break;
        }
        
        if (a == null || b == null) break;
        
        System.out.println(a + b);
    }
  }
}