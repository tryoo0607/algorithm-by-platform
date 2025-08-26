import java.util.Scanner;

public class Main {
  public static void main(String[] args){
    Scanner in=new Scanner(System.in);
    String time = in.nextLine();
    int c = in.nextInt();
    
    String[] timeArr = time.split(" ");
    int h = Integer.valueOf(timeArr[0]);
    int m = Integer.valueOf(timeArr[1]);
      
    int addHour = c / 60;
    int addMin = c % 60;
      
    h += addHour;
    m += addMin;
      
    if(m >= 60) {
        int t = m / 60;
        h += t;
        m = m % 60;
    }
      
    if(h >= 24) {
        h = h % 24;
    }
    
    System.out.println(h + " " + m);
  }
}