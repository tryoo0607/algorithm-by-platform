import java.util.Scanner;

public class Main {
  public static void main(String[] args){
    Scanner in=new Scanner(System.in);
    String dice = in.nextLine();
    int a = Integer.valueOf(dice.split(" ")[0]);
    int b = Integer.valueOf(dice.split(" ")[1]);
    int c = Integer.valueOf(dice.split(" ")[2]);
      
    int result = 0;
      
    if(a == b && b == c) {
        
        result = 10000 + a * 1000;
        
    } else if (a == b) {

        result = 1000 + a * 100;
    } else if (b == c) {
        
        result = 1000 + b * 100;
    } else if (c == a) {
        
        result = 1000 + c * 100;    
    } else {
        int max = Math.max(a, Math.max(b, c));
        
        result = max * 100;
    }
     
    
    System.out.println(result);
  }
}