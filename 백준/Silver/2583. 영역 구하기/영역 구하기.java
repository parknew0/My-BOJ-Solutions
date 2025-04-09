
import java.io.*;
import java.util.*;

public class Main {
    static int[] dx = {0, 0, -1, 1};
    static int[] dy = {-1, 1, 0, 0};
    static int m, n, k;
    static int[][] matrix;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] tokens = br.readLine().split(" ");
        m = Integer.parseInt(tokens[0]); // y축
        n = Integer.parseInt(tokens[1]); // x축
        k = Integer.parseInt(tokens[2]);

        matrix = new int[n][m]; // 유클리드 좌표계 (x,y)로 구현하겠다. 

        while (k-- > 0) {
            tokens = br.readLine().split(" ");
            int x1 = Integer.parseInt(tokens[0]);
            int y1 = Integer.parseInt(tokens[1]);
            int x2 = Integer.parseInt(tokens[2]);
            int y2 = Integer.parseInt(tokens[3]);

            for (int i = y1 ; i < y2 ; i++) {
                for (int j = x1 ; j < x2 ; j++) {
                    if (matrix[j][i] == 1) continue;
                    matrix[j][i] = 1; // visited
                }
            }
        }

        int count = 0;
        List<Integer> list = new ArrayList<>();
        for (int i = 0 ; i < m ; i++) {
            for (int j = 0 ; j < n ; j++) {
                if (matrix[j][i] == 0) {
                    list.add(dfs(j, i));
                    count++;
                }
            }
        }
        list.sort(Comparator.naturalOrder());
        System.out.println(count);
        for (int item : list) {
            System.out.print(item + " ");
        }
    }

    public static int dfs (int startX, int startY) {
        int count = 0;
        Deque<int[]> stack = new ArrayDeque<>();
        stack.push(new int[]{startX, startY});

        while (!stack.isEmpty()) {
            int[] cur = stack.pop();
            int x = cur[0];
            int y = cur[1];
            if (matrix[x][y] == 1) continue;

            matrix[x][y] = 1;
            count++;

            for (int i = 0 ; i < 4 ; i++) {
                int nx = x + dx[i];
                int ny = y + dy[i];

                if (0 <= nx && nx < n && 0 <= ny && ny < m && matrix[nx][ny] == 0) {
                    stack.push(new int[]{nx,ny});
                }
            }

        }

        return count;
    }
}
