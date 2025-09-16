import java.util.Scanner;

public class Main {

    public static void main(String[] args){

        Scanner in = new Scanner(System.in);
        String str = in.next();
  
        String[] list = {"c=", "c-", "dz=", "d-", "lj", "nj", "s=", "z="};
        
        for(String s : list) {
            str = str.replace(s, "*");
        }
        
        System.out.println(str.length());
    }
}