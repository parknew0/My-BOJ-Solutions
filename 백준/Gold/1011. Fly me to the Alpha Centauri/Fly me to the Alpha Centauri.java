import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int T = Integer.parseInt(br.readLine());
        
        for (int t = 0; t < T; t++) {
            String[] tokens = br.readLine().split(" ");
            long x = Long.parseLong(tokens[0]);
            long y = Long.parseLong(tokens[1]);
            long d = y - x;
            
            if (d == 0) {
                sb.append("0").append("\n");
                continue;
            }
            
            long n = (long)Math.sqrt(d);
            if(n * n == d) {
                sb.append(2 * n - 1).append("\n");
            }
            else if(d <= n * n + n) {
                sb.append(2 * n).append("\n");
            }
            else {
                sb.append(2 * n + 1).append("\n");
            }
        }
        System.out.print(sb);
    }
}
