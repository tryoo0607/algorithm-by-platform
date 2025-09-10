import java.util.Scanner;

public class Main {

    public static void main(String[] args){

        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        String str = in.next();

        
        int total = 0;
        for(char c : str.toCharArray()) {
            int num = c - '0';
            
            total += num;
        }
        
        
        System.out.println(total);
    }
}