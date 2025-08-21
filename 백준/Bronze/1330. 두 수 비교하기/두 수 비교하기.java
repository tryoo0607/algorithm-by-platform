import java.util.Scanner;

public class Main {
  public static void main(String[] args){
    Scanner in=new Scanner(System.in);
    String str = in.nextLine();
    String[] strArr = str.split(" ");
    
    int a = Integer.parseInt(strArr[0]);
    int b = Integer.parseInt(strArr[1]);
    
    String sign = (a == b) ? "==" 
              : (a > b) ? ">" 
              : "<";
    
    System.out.println(sign);
  }
}