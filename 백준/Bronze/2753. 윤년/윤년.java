import java.util.Scanner;

public class Main {
  public static void main(String[] args){
    Scanner in=new Scanner(System.in);
    int year = in.nextInt();
    
    int result = ((year % 4 == 0) && (year % 100 != 0 || year % 400 == 0)) ? 1 : 0;

    System.out.println(result);
  }
}