import java.util.*;
import java.io.*;

public class Main {
    public static void main (String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        
        StringBuilder sb = new StringBuilder();
        while (t-- > 0) {
            String[] tokens = br.readLine().split(" ");
            int n = Integer.parseInt(tokens[0]);
            int m = Integer.parseInt(tokens[1]);
            sb.append(n-1).append("\n");
            
            for (int i = 0; i < m ; i++) {
                br.readLine();
            }
        }
        
        System.out.println(sb.toString());
    }
}