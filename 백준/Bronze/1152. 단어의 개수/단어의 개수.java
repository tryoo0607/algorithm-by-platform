import java.util.Scanner;

public class Main {

    public static void main(String[] args){

        Scanner in = new Scanner(System.in);
        String str = in.nextLine().trim();
        String target = str.trim();

        if (target.isEmpty()) {
            System.out.println(0);
            return;
        }
        
        String[] arr = target.split(" ");
        
        System.out.println(arr.length);
    }
}