import java.util.Scanner;

public class Main {

    public static void main(String[] args){

        Scanner in = new Scanner(System.in);
        String str = in.next();
        char[] arr = str.toCharArray();

        boolean isPalindrome = true;
        int lt = 0;
        int rt = arr.length - 1;
        while(lt < rt) {
            if(arr[lt] != arr[rt]) {
                isPalindrome = false;
                break;
            }
            
            lt++;
            rt--;
        }
        
        int result = isPalindrome ? 1 : 0;
        
        System.out.println(result);
    }
}