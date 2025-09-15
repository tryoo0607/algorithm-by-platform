import java.util.Scanner;

public class Main {

    public static void main(String[] args){

        Scanner in = new Scanner(System.in);
        String str = in.next();
        int n = 26;
        
        str = str.toUpperCase();

        int[] alphabet = new int[n];
        for(char c : str.toCharArray()) {
            int idx = c - 'A';
            
            alphabet[idx]++;
        }
        
        int targetIdx = -1;
        int max = -1;
        boolean isDuplicated = false;
        
        for(int i=0; i<n; i++) {
            int count = alphabet[i];
            
            if (max < count) {
                max = count;
                targetIdx = i;
                isDuplicated = false;
            } else if(max == count) {
                isDuplicated = true;
            }
        }
       
        char result = isDuplicated ? '?' : (char) (targetIdx + 'A');
        
        System.out.println(result);
    }
}