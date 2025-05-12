import java.io.*;
import java.util.*;

public class Main {
    public static void main (String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[][] map = new int[n + 1][n + 1];
        int[][][] dp = new int[n + 1][n + 1][3];

        for (int i = 0 ; i < n ; i++) {
            String[] tokens = br.readLine().split(" ");
            for (int j = 0 ; j < n ; j++) {
                map[i + 1][j + 1] = Integer.parseInt(tokens[j]);
            }
        }
        // 0: 가로 1: 세로 2: 대각
        dp[1][2][0] = 1;

        for (int i = 1 ; i <= n ; i++) {
            for (int j = 2 ; j <= n ; j++) {
                if (j > 1 && map[i][j] == 0) {
                    dp[i][j][0] += dp[i][j - 1][0] + dp[i][j - 1][2];
                }
                if (i > 1 && map[i][j] == 0) {
                    dp[i][j][1] += dp[i - 1][j][1] + dp[i - 1][j][2];
                }
                if (i > 1 && j > 1 && map[i][j] == 0 && map[i - 1][j] == 0 && map[i][j - 1] == 0) {
                    dp[i][j][2] += dp[i - 1][j - 1][0] + dp[i - 1][j - 1][1] + dp[i - 1][j - 1][2];
                }

            }
        }

        int res = dp[n][n][0] + dp[n][n][1] + dp[n][n][2];
        System.out.println(res);

    }

}
