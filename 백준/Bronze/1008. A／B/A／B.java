import java.util.Scanner;
  
public class Main {
  public static void main(String[] args){
    Scanner in=new Scanner(System.in);
    int a = in.nextInt();
    int b = in.nextInt();
      
    Main T = new Main();
    System.out.println(T.solution(a, b));
    return ;
  }
  
  public double solution(int a, int b) {
      
      return (double) a/b;
  }
}