import java.util.Scanner;

public class Main {
  public static void main(String[] args){
    Scanner in=new Scanner(System.in);
    int h = in.nextInt();
    int m = in.nextInt();
    
    m = m-45;
      
    if(m < 0) {
        h--;
        m = 60 + m;
    }
      
    if(h < 0) {
        h = 24 + h;
    }
    
    System.out.println(h + " " + m);
  }
}