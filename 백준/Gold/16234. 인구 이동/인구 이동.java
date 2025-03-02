
import java.io.*;
import java.util.*;

public class Main {
    public static int[] dx = {-1, 1, 0, 0};
    public static int[] dy = {0, 0, -1, 1};
    public static boolean isDone = false;
    public static int n;
    public static int l;
    public static int r;
    public static int[][] matrix;
    public static void main(String[] args) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] tokens = br.readLine().split(" ");
        n = Integer.parseInt(tokens[0]);
        l = Integer.parseInt(tokens[1]);
        r = Integer.parseInt(tokens[2]);
        matrix = new int[n][n];

        for (int i = 0 ; i < n ; i++) {
            tokens = br.readLine().split(" ");
            for (int j = 0 ; j < n ; j++) {
                matrix[i][j] = Integer.parseInt(tokens[j]);
            }
        }
        /* 입력끝 */

        int days = 0;
        while(!isDone) {
            isDone = true;

            Deque<int[]> queue = new ArrayDeque<>();
            boolean[][] visited = new boolean[n][n];

            for (int i = 0 ; i < n ; i++) {
                for (int j = 0 ; j < n ; j++) {
                    if (!visited[i][j]) bfs(queue, visited, i, j);
                }
            }

            if(!isDone) days += 1;
        }

        System.out.print(days);
    }

    public static void bfs(Deque<int[]> queue, boolean[][] visited, int startX, int startY){
        List<int[]> unitedCountries = new ArrayList<>();
        int sum = 0;
        int count = 0;

        queue.offer(new int[]{startX, startY});
        visited[startX][startY] = true;

        while (!queue.isEmpty()) {
            int[] cur = queue.poll();
            int curX = cur[0];
            int curY = cur[1];

            sum += matrix[curX][curY];
            unitedCountries.add(new int[]{curX, curY});
            count += 1;

            for (int i = 0 ; i < 4 ; i++) {
                int nx = curX + dx[i];
                int ny = curY + dy[i];

                if (0 <= nx && nx < n && 0 <= ny && ny < n && !visited[nx][ny]) {
                    int diff = Math.abs(matrix[nx][ny] - matrix[curX][curY]);
                    if (l <= diff && diff <= r) {
                        queue.offer(new int[] {nx,ny});
                        visited[nx][ny] = true;
                    }
                }
            }
        }

        for (int i = 0 ; i < unitedCountries.size() ; i++) {
            int x = unitedCountries.get(i)[0];
            int y = unitedCountries.get(i)[1];

            matrix[x][y] = sum / count;

        }

        if (count > 1) {
            isDone = false;
        }

    }
}
