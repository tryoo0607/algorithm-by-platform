import java.util.Scanner;

public class Main {

    public static void main(String[] args){

        Scanner in = new Scanner(System.in);
        String str = in.next();

        int total = 0;
        for(char c : str.toCharArray()) {

            int dial = 0;
            switch (c) {
                case 'A': case 'B': case 'C':
                    dial = 2;
                    break;
                case 'D': case 'E': case 'F':
                    dial = 3;
                    break;
                case 'G': case 'H': case 'I':
                    dial = 4;
                    break;
                case 'J': case 'K': case 'L':
                    dial = 5;
                    break;
                case 'M': case 'N': case 'O':
                    dial = 6;
                    break;
                case 'P': case 'Q': case 'R': case 'S':
                    dial = 7;
                    break;
                case 'T': case 'U': case 'V':
                    dial = 8;
                    break;
                case 'W': case 'X': case 'Y': case 'Z':
                    dial = 9;
                    break;
            }
            
            int num = dial != 0 ? dial : 10;
            total += 2 + (num - 1);
        }
        System.out.println(total);
    }
}