import java.util.Scanner;
import java.lang.StringBuilder;

public class Main {
  public static void main(String[] args){
    Scanner in=new Scanner(System.in);
    int n = in.nextInt();
    
    for(int i = 1; i <= n; i++) {
        for(int j=n-i; j>0; j--) {
            System.out.print(" ");
        }
        for(int j=1; j <=i; j++) {
            System.out.print("*");
        }
        
        System.out.println("");
    }
  }
}