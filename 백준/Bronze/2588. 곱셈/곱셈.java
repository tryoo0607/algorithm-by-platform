import java.util.Scanner;

public class Main {
  public static void main(String[] args){
    Scanner in=new Scanner(System.in);
    int a = in.nextInt();
    int b = in.nextInt();
    
    String str = String.valueOf(b);
    int digit = 1;
    int sum = 0;
    for(int i=str.length() - 1; i >=0; i--) {
        int target = str.charAt(i) - '0';
        int value = a*target;
        sum += value*digit;
        System.out.println(value);
        digit *= 10;
    }
      
    System.out.println(sum);
  }
}