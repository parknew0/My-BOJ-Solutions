
import java.io.*;
import java.util.*;
import java.math.*;

public class Main {
    public static void main(String[] args) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int m = Integer.parseInt(br.readLine());
        int[][] matrix = new int[n+1][n+1];

        for (int i = 1 ; i <= n ; i++) {
            Arrays.fill(matrix[i], Integer.MAX_VALUE);
            matrix[i][i] = 0;
        }

        String[] tokens;
        for (int i = 0 ; i < m ; i++) {
            tokens = br.readLine().split(" ");
            int departure = Integer.parseInt(tokens[0]);
            int arrival = Integer.parseInt(tokens[1]);
            int cost = Integer.parseInt(tokens[2]);

            matrix[departure][arrival] = Math.min(matrix[departure][arrival], cost);
        }

        tokens = br.readLine().split(" ");
        int start = Integer.parseInt(tokens[0]);
        int end = Integer.parseInt(tokens[1]);
        /* 입력 끝 */

        boolean[] visited = new boolean[n+1];
        int[] dist = new int[n+1];
        // 거리 배열 초기화
        Arrays.fill(dist, Integer.MAX_VALUE);
        dist[start] = 0;  // 시작점의 거리는 0

        for (int i = 0 ; i < n ; i++) {
            int minNode = -1;
            int minValue = Integer.MAX_VALUE;

            for (int j = 1; j <= n; j++) {
                if (!visited[j] && dist[j] < minValue) {
                    minValue = dist[j];
                    minNode = j;
                }
            }

            if (minNode == -1) break;

            visited[minNode] = true;

            for (int j = 1; j <= n; j++) {
                if (!visited[j] && matrix[minNode][j] != Integer.MAX_VALUE) { // 연결된 노드만 확인
                    int newDist = dist[minNode] + matrix[minNode][j];
                    if (newDist < dist[j]) {
                        dist[j] = newDist;
                    }
                }
            }
        }

        System.out.print(dist[end]);

    }
}
