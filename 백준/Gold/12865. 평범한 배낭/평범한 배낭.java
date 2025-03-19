
import java.io.*;
import java.util.*;

public class Main {
    public static StringBuilder sb = new StringBuilder();
    public static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws IOException {
        String[] tokens = br.readLine().split(" ");
        int n = Integer.parseInt(tokens[0]);
        int k = Integer.parseInt(tokens[1]);

        int[] dp = new int[k + 1];

        for (int i = 0 ; i < n ; i++) {
            tokens = br.readLine().split(" ");
            int w = Integer.parseInt(tokens[0]);
            int v = Integer.parseInt(tokens[1]);

            if (w > k) continue;

            for (int j = k ; j >= 0 ; j--) {
                if (j - w >= 0) {
                    dp[j] = Math.max(dp[j], dp[j - w] + v);
                }
            }
        }
        System.out.print(dp[k]);
    }
}