import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[] arr = new int[n + 1];
        int[] dp = new int[n + 1];

        String[] tokens = br.readLine().split(" ");
        for (int i = 0 ; i < n ; i++) {
            arr[i + 1] = Integer.parseInt(tokens[i]);
        }
        Arrays.fill(dp, 1);

        for (int i = 2 ; i <= n ; i++) {
            for (int j = 1 ; j < i ; j++) {
                if (arr[j] > arr[i]) dp[i] = Math.max(dp[i], dp[j] + 1);
            }
        }
        
        int max = 1;
        for (int x : dp) {
            max = Math.max(max, x);
        }

        System.out.println(max);
    }
}
