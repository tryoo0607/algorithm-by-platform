import java.io.*;

import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        String line =  br.readLine();
        String[] lineArr = line.split(" ");
        
        int[] numArr = Arrays.stream(lineArr)
            .mapToInt(Integer::parseInt)
            .toArray();
        
        int[] filteredArr = Arrays.stream(numArr)
            .distinct()
            .sorted()
            .toArray();
        
        Map<Integer, Integer> map = new HashMap();
        
        int index = 0;
        for(int num : filteredArr) {
            map.put(num, index++);
        }
       

        StringBuilder builder = new StringBuilder();

        for (int num  : numArr) {
            
            builder.append(map.get(num))
                .append("\n");
        }

        System.out.print(builder);
    }

}