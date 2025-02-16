import java.io.*;
import java.util.*;

public class Main {
    // 상, 하, 좌, 우 이동 (배열에서는 아래로 내려가는 게 윗쪽 이동이다)
    static int[] dx = {-1, 1, 0, 0}; // x는 상, 하 관여, 행 이동
    static int[] dy = {0, 0, -1, 1}; // y는 좌, 우 관여, 열 이동

    static int m, n; // 배추밭 크기
    static int[][] matrix; // 배추밭 정보
    static boolean[][] visited; // 방문 체크 배열

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());

        while (t-- > 0) {
            String[] tokens = br.readLine().split(" ");
            m = Integer.parseInt(tokens[0]); // 배추밭 가로길이
            n = Integer.parseInt(tokens[1]); // 배추밭 세로길이
            int k = Integer.parseInt(tokens[2]); // 배추 개수

            matrix = new int[n][m];
            visited = new boolean[n][m];

            for (int i = 0; i < k; i++) {
                tokens = br.readLine().split(" ");
                int y = Integer.parseInt(tokens[0]);
                int x = Integer.parseInt(tokens[1]);
                matrix[x][y] = 1;
            }

            int sum = 0;
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < m; j++) {
                    if (matrix[i][j] == 1) {
                        sum += dfs(i, j);
                    }
                }
            }
            System.out.println(sum);
        }
    }

    static int dfs(int startX,int startY) {
        Deque<int[]> stack = new ArrayDeque<>();
        stack.push(new int[]{startX,startY});
        boolean res = false;

        while (!stack.isEmpty()) {
            int[] node = stack.pop();
            int x = node[0];
            int y = node[1];

            if (visited[x][y]) continue;
            visited[x][y] = true;
            res = true;

            // 상하좌우 탐색함
            for (int i = 0; i < 4; i++) {
                int nx = x + dx[i];
                int ny = y + dy[i];

                if (nx >= 0 && nx < n && ny >=0 && ny < m && !visited[nx][ny]) {
                    if (matrix[nx][ny] == 1) {
                        stack.push(new int[]{nx, ny});
                    }
                }

            }

        }

        return res ? 1 : 0;

    }
}
