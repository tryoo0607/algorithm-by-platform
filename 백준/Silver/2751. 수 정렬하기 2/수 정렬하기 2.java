import java.util.*;
import java.io.*;

import java.lang.Math;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int n = Integer.parseInt(br.readLine());
        
        List<Integer> arr = new ArrayList<>();

        for(int i=0; i < n; i++) {
            arr.add(Integer.parseInt(br.readLine()));
        }

        arr.sort(Comparator.naturalOrder());

        StringBuilder sb = new StringBuilder();
        for (int num : arr) {
            sb.append(num).append('\n');
        }
        System.out.print(sb);
    }

} 