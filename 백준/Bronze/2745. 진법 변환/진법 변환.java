import java.util.*;
import java.util.stream.*;

public class Main {
    public static int changeCharacterToNum(char c) {
        
        if(Character.isDigit(c)) {
            
            return c - '0';
        }
        
        return c - 'A' + 10;
    }

    public static void main(String[] args){

        Scanner in = new Scanner(System.in);
        String str = in.next();
        int base = in.nextInt();
        
        int total = 0;
        for(int i  = 0; i<str.length(); i++) {
            int digits = (str.length() - 1) - i;
            int weight = (int) Math.pow(base, digits);
            
            Character c = str.charAt(i);
            int num = changeCharacterToNum(c);
            
            total += num * weight; 
        }
        
        System.out.println(total);
    }
}