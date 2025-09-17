import java.util.Scanner;

public class Main {

    public static void main(String[] args){

        Scanner in = new Scanner(System.in);
        int n = in.nextInt();

        int count = 0;

        for(int i=0; i < n; i++) {
            String str = in.next();
            
            char prev = '*'    ;
            boolean isGroup = true;
            boolean[] checked = new boolean[26];
            
            for(char c : str.toCharArray()) {
                
                if(prev != c) {
                    if(checked[c - 'a']) {
                        isGroup = false;
                        break;
                    }
                }
                
                checked[c - 'a'] = true;
                
                prev = c;
            }
            
            if(isGroup) count++;
        }
        
        System.out.println(count);        
    }
}