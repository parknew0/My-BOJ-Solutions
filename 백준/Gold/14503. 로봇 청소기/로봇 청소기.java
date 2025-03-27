
import java.io.*;
import java.util.*;

public class Main {
    public static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    public static StringBuilder sb = new StringBuilder();

    public static int[][] matrix;
    public static int n, m;
    // 0: ↑, 1: ←, 2: ↓, 3: → // 반시계 방향으로 도는걸 정의한 것, 진행방향을 정의한것이 아님
    public static int[] dx = {-1, 0, 1, 0};
    public static int[] dy = {0, -1, 0, 1};

    public static void main(String[] args) throws IOException {
      String[] tokens = br.readLine().split(" ");
      n = Integer.parseInt(tokens[0]);
      m = Integer.parseInt(tokens[1]);

      tokens = br.readLine().split(" ");
      int start_x = Integer.parseInt(tokens[0]);
      int start_y = Integer.parseInt(tokens[1]);
      int init_dir = Integer.parseInt(tokens[2]);

      matrix = new int[n][m];
      for (int i = 0 ; i < n ; i++) {
          tokens = br.readLine().split(" ");
          for (int j = 0 ; j < m ; j++) {
              matrix[i][j] = Integer.parseInt(tokens[j]);
          }
      }

      int result = cleaning(start_x, start_y, init_dir);

      System.out.print(result);
    }

    public static int cleaning (int x, int y, int d) {
        int count = 0;

        while (true) {
            if (matrix[x][y] == 0) {
                count++;
                matrix[x][y] = 2;
                //System.out.println("좌표 : " + x + "," + y + " 방향: " + d);
            }

            boolean flag = false;
            // 0: ↑, 1: ←, 2: ↓, 3: →
            // d는 바라보는 방향, i는 90도 회전해서 나아가는 방향
            int i = -1;
            if (d == 0) i = 1;
            else if (d == 1) i = 0;
            else if (d == 2) i = 3;
            else if (d == 3) i = 2;

            for (int j = i; j < i + 4 ; j++) {
                int nx = x + dx[j % 4];
                int ny = y + dy[j % 4];

                if (0 <= nx && nx < n && 0 <= ny && ny < m && matrix[nx][ny] == 0) {
                    if (j % 4 == 0) d = 0;
                    else if (j % 4 == 1) d = 3;
                    else if (j % 4 == 2) d = 2;
                    else if (j % 4 == 3) d = 1;

                    x = nx;
                    y = ny;
                    flag = true;
                    break;
                }
            }

            if (!flag) {
                // 후진
                if (d == 0) i = 2;
                else if (d == 1) i = 1;
                else if (d == 2) i = 0;
                else if (d == 3) i = 3;

                int nx = x + dx[i % 4];
                int ny = y + dy[i % 4];

                if (0 <= nx && nx < n && 0 <= ny && ny < m && !(matrix[nx][ny] == 1)) {
                    x = nx;
                    y = ny;
                }
                else if (matrix[nx][ny] == 1) break;
            }
        }
        return count;
    }

}