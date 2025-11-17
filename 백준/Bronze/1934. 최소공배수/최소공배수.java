import java.util.*;

import java.util.stream.*;

import java.lang.Math;

public class Main {
    
    public static int gcd(int a , int b) {
        while (b != 0) {
		    int tmp = b;
		    b = a % b;
		    a = tmp;
	    }
	    return a;
    }
    
    public static int lcm(int a, int b) {
	    int c = gcd(a, b);
    	return a * b / c;
    }

    public static void main(String[] args){

        Scanner in = new Scanner(System.in);

        int n = in.nextInt();

        Set<String> set = new HashSet<>();

        StringBuilder sb = new StringBuilder();
        for(int i=0; i<n; i++) {
            
            int a = in.nextInt();
            int b = in.nextInt();
            
            sb.append(lcm(a, b))
                .append("\n");
        }

        
       System.out.println(sb.toString());
    }

} 