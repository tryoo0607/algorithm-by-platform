import java.util.*;
import java.util.stream.*;
import java.lang.Math;

public class Main {
    
    public static void main(String[] args){

        Scanner in = new Scanner(System.in);
        
        List<Integer> listX = new ArrayList<>();
        List<Integer> listY = new ArrayList<>();
        
        for(int i=0; i<3; i++) {
            int x = in.nextInt();
            int y = in.nextInt();
            
            if(listX.contains(x)) {
                listX.remove(Integer.valueOf(x));
            } else {
                listX.add(x);
            }
            
            if(listY.contains(y)) {
                listY.remove(Integer.valueOf(y));
            } else {
                listY.add(y);
            }
        }
        
        System.out.println(listX.get(0) + " " + listY.get(0));
    }
}