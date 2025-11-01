import java.io.*;

import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        List<String[]> list = new ArrayList();
        for (int i = 0; i < N; i++) {
            String line =  br.readLine();
            String[] member = line.split(" ");
            
            list.add(member);
        }       

        list.sort((a, b) -> {
            int ageA = Integer.parseInt(a[0]);
            int ageB = Integer.parseInt(b[0]);
            
            return ageA - ageB;
        });

        StringBuilder builder = new StringBuilder();

        for (String[] member : list) {
            
            builder.append(member[0])
                .append(" ")
                .append(member[1])
                .append("\n");

        }

        System.out.print(builder);

    }

}