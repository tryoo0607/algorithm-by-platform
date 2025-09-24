import java.util.*;
import java.util.stream.*;

public class Main {
    public static char numToChar(int num) {
        
        if(num>=0 && num <=9) {
            return (char) ('0' + num);
        }
        
         return (char) ('A' + (num - 10));
    }

    public static void main(String[] args){

        Scanner in = new Scanner(System.in);
        int num = in.nextInt();
        int base = in.nextInt();
        
        int share = num;
        
        StringBuilder bulder = new StringBuilder();
        while(share > 0) {
            int remainder = share % base;
            share = share / base;
            
            bulder.insert(0, numToChar(remainder));
        }
        
        System.out.println(bulder.toString());
    }
}