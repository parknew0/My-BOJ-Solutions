
import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[] arr= new int[n];
        String[] tokens = br.readLine().split(" ");
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(tokens[i]);
        }

        int[] dp = new int[n];
        for (int i = 0; i < n; i++) {
            if (dp[i] == 0) dp[i] = 1;

            for (int j = i + 1; j < n; j++) {
                if (arr[i] < arr[j]) dp[j] = Math.max(dp[j], dp[i] + 1);
            }
        }

        int max = Integer.MIN_VALUE;
        for (int i = 0; i < n; i++) {
            max = Math.max(max, dp[i]);
        }

        System.out.println(max);
    }

}
