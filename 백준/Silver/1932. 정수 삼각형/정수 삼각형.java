
import java.io.*;
import java.util.*;
import java.math.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[][] triArr = new int[n][];
        int[][] dp = new int[n][];

        for (int i = 0 ; i < n ; i++){
            triArr[i] = new int[i + 1];
            dp[i] = new int[i + 1];

            StringTokenizer st = new StringTokenizer(br.readLine());

            for (int j = 0 ; j <= i ; j++) {
                triArr[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        /* 입력 종료 */

        dp[0][0] = triArr[0][0];

        for (int i = 1 ; i < n ; i++){
            for (int j = 0 ; j <= i ; j++) {
                if (j == 0) dp[i][j] = triArr[i][j] + dp[i - 1][j];
                else if (j == triArr[i].length - 1) dp[i][j] = triArr[i][j] + dp[i - 1][j - 1];
                else dp[i][j] = Math.max(triArr[i][j] + dp[i - 1][j - 1], triArr[i][j] + dp[i - 1][j]);
            }
        }

        int max = Integer.MIN_VALUE;
        for (int i = 0 ; i < n ; i++) {
            max = Math.max(max,dp[n-1][i]);
        }

        System.out.print(max);

    }
}
