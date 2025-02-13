import java.io.*;

public class Main {
    static int[] dp;
    static int[] arr;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(br.readLine());
        }

        dp = new int[n]; // DP 배열 생성
        System.out.println(getMaxStairs(n));
    }

    public static int getMaxStairs(int n) {
        if (n == 1) return arr[0];
        if (n == 2) return arr[0] + arr[1];

        dp[0] = arr[0];
        dp[1] = arr[0] + arr[1];
        dp[2] = Math.max(arr[0], arr[1]) + arr[2];

        for (int i = 3; i < n; i++) {
            dp[i] = Math.max(dp[i - 2], dp[i - 3] + arr[i - 1]) + arr[i];
        }

        return dp[n - 1];
    }
}
