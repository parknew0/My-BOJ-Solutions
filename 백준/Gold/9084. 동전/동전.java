
import java.io.*;
import java.util.*;

public class Main {
    public static StringBuilder sb = new StringBuilder();
    public static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws IOException {
        int t = Integer.parseInt(br.readLine());

        while (t-- > 0) {
            int n = Integer.parseInt(br.readLine());
            int[] arr = new int[n];
            String[] tokens = br.readLine().split(" ");
            for (int i = 0 ; i < n ; i++) {
                arr[i] = Integer.parseInt(tokens[i]);
            }
            int amount = Integer.parseInt(br.readLine());

            solve(arr, n, amount);
        }

        System.out.print(sb);
    }

    public static void solve (int[] arr,int n, int amount) {
        int[] dp = new int[amount + 1];

        dp[0] = 1;

        for (int i = 0 ; i < n ; i++) {
            int c = arr[i];
            for (int j = 1 ; j <= amount ; j++) {
                if (j - c >= 0) dp[j] += dp[j - c];
            }
        }

        sb.append(dp[amount]).append("\n");

    }
}