import java.io.*;
import java.util.StringTokenizer;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out)); 
    
    int n = Integer.parseInt(br.readLine());
    for(int i=0; i<n; i++) {
        String line = br.readLine();
        StringTokenizer st = new StringTokenizer(line);
        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());
        
        bw.write(a + b + "\n");
    }
      
    bw.flush();
      
    br.close();
    bw.close();
  }
}