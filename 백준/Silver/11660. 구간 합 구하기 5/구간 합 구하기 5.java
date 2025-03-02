
import java.io.*;
import java.util.*;
import java.math.*;

public class Main {
    public static void main(String[] args) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        int[][] matrix = new int[n + 1][n + 1];
        int[][] dp = new int[n + 1][n + 1];
        int[][] locations = new int[m][4]; // x1, y1, x2, y2

        for (int i = 1 ; i <= n ; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 1 ; j <= n ; j++) {
                matrix[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        for (int i = 0 ; i < m ; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0 ; j < 4 ; j++) {
                locations[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        /* 입력 끝 */

        // DP 초기화, 1 행이 베이스 조건
        int rowSum = 0;
        for (int i = 1 ; i <= n ; i++) {
            rowSum += matrix[1][i];
            dp[1][i] = rowSum;
        }

        for (int i = 2 ; i <= n ; i++) {
            rowSum = 0;
            for (int j = 0 ; j <= n ; j++) {
                rowSum += matrix[i][j];
                dp[i][j] = dp[i - 1][j] + rowSum;
            }
        }

        StringBuilder sb = new StringBuilder();
        for (int i = 0 ; i < m ; i++) {
            int x1 = locations[i][0];
            int y1 = locations[i][1];
            int x2 = locations[i][2];
            int y2 = locations[i][3];

            int result = dp[x2][y2] - dp[x1 - 1][y2] - dp[x2][y1 - 1] + dp[x1 - 1][y1 - 1];
            sb.append(result).append("\n");
        }

        System.out.print(sb);

    }
}
