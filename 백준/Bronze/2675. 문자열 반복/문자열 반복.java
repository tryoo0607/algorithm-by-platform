import java.util.Scanner;

public class Main {

    public static void main(String[] args){

        Scanner in = new Scanner(System.in);
        int t = in.nextInt();


        for(int i=0; i<t; i++) {
            int r = in.nextInt();
            String str = in.next();

            StringBuilder builder = new StringBuilder();
            for(char c : str.toCharArray()) {
                builder.append(String.valueOf(c).repeat(r));
            }

            System.out.println(builder.toString());
        }
    }
}