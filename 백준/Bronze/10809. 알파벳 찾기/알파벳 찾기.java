import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args){

        Scanner in = new Scanner(System.in);
        String str = in.next();

        String alphabet = "abcdefghijklmnopqrstuvwxyz";
        
        List<Integer> list = new ArrayList<>();
        for(char c : alphabet.toCharArray()) {

            list.add(str.indexOf(c));
        }
        
        String result = list.stream()
            .map(String::valueOf)
            .collect(Collectors.joining(" "));
        
        System.out.println(result);
    }
}