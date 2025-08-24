import java.util.Scanner;

public class Main {
  public static void main(String[] args){
    Scanner in=new Scanner(System.in);
    int x = in.nextInt();
    int y = in.nextInt();
    
    int result = 0;
    if(x > 0) {
        if(y > 0) {
            result = 1;
        } else if (y < 0) {
            result = 4;
        }
    } else if (x < 0){
        if(y > 0) {
            result = 2;
        } else if (y < 0) {
            result = 3;
        }
    }
    
    System.out.println(result);
  }
}