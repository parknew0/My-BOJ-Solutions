
import java.io.*;
import java.util.*;

public class Main {
    //  동, 남, 서, 북
    static int[] dx = {0, -1, 0, 1};
    static int[] dy = {1, 0, -1, 0};
    public static void main(String[] args) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] tokens = br.readLine().split(" ");
        int n = Integer.parseInt(tokens[0]);
        int m = Integer.parseInt(tokens[1]);
        int[][] matrix = new int[n][m];
        boolean[][] visited = new boolean[n][m];
        int[][] distance = new int[n][m];

        int[] startIndex = new int[2]; // 차례대로 row, col 좌표
        for (int i = 0; i < n; i++) {
            tokens = br.readLine().split(" ");
            for (int j = 0; j < m; j++) {
                matrix[i][j] = tokens[j].charAt(0) - '0';

                if (tokens[j].charAt(0) == '2') {
                    startIndex[0] = i;
                    startIndex[1] = j;
                }
            }
        }

        bfs(matrix, startIndex, visited, distance);

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (!visited[i][j] && matrix[i][j] == 1) {
                    distance[i][j] = -1;
                }
            }
        }

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i <n ; i++) {
            for (int j = 0; j < m ; j++) {
                sb.append(distance[i][j]).append(" ");
            }
            sb.append("\n");
        }

        System.out.println(sb.toString());
    }

    public static void bfs(int[][] matrix, int[] startIndex, boolean[][] visited, int[][] distance) {
        int row = matrix.length;
        int col = matrix[0].length;
        int level = 0;

        Deque<int[]> queue = new ArrayDeque<>();
        queue.offer(startIndex);
        visited[startIndex[0]][startIndex[1]] = true;
        distance[startIndex[0]][startIndex[1]] = level;

        while(!queue.isEmpty()) {
            int size = queue.size();
            level++;

            while (size-- > 0) {
                int[] cur = queue.poll();
                int curX = cur[0];
                int curY = cur[1];

                for (int i = 0; i < 4; i++) {
                    int nx = curX + dx[i];
                    int ny = curY + dy[i];

                    if (0 <= nx && nx < row && 0<= ny && ny < col && !visited[nx][ny] && matrix[nx][ny] != 0) {
                        queue.offer(new int[]{nx,ny});
                        visited[nx][ny] = true;
                        distance[nx][ny] = level;
                    }
                }
            }
        }
    }
}