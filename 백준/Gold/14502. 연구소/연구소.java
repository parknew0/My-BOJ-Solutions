
import java.io.*;
import java.util.*;

public class Main {
    public static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    public static int[] dx = {0, 0, -1, 1};
    public static int[] dy = {-1, 1, 0, 0};

    public static int[][] matrix;
    public static List<int[]> blanks = new ArrayList<>();
    public static List<int[]> virusStartPoint= new ArrayList<>();
    public static int n;
    public static int m;
    public static int max = 0;

    public static void main(String[] args) throws IOException {
        String[] tokens = br.readLine().split(" ");
        n = Integer.parseInt(tokens[0]); // row
        m = Integer.parseInt(tokens[1]); // col
        matrix = new int[n][m];

        for (int i = 0 ; i < n ; i++) {
            tokens = br.readLine().split(" ");
            for (int j = 0 ; j < m ; j++) {
                matrix[i][j] = Integer.parseInt(tokens[j]);

                if (matrix[i][j] == 0) {
                    blanks.add(new int[]{i, j});
                }
                if (matrix[i][j] == 2) {
                    virusStartPoint.add(new int[]{i, j});
                }
            }
        }

        comb(0, 0, new ArrayList<>());

        System.out.print(max);
    }

    public static void comb (int start, int depth, List<int[]> selected) {
        if (depth == 3) {
            int safezones = bfs(selected);
            max = Math.max(safezones, max);

            return;
        }

        for (int i = start ; i < blanks.size() ; i++) {
            selected.add(blanks.get(i));
            comb(i + 1, depth + 1, selected);
            selected.remove(selected.size() - 1);
        }
    }

    public static int bfs (List<int[]> selected) {
        int[][] copy = new int[matrix.length][];
        for (int i = 0 ; i < matrix.length ; i++) {
            copy[i] = matrix[i].clone();
        }
        for (int i = 0 ; i < selected.size() ; i++) {
            int[] cur = selected.get(i);
            copy[cur[0]][cur[1]] = 1;
        }

        Deque<int[]> queue = new ArrayDeque<>();
        for (int i = 0 ; i < virusStartPoint.size() ; i++) {
            int[] cur = virusStartPoint.get(i);
            queue.offer(new int[] {cur[0],cur[1]});
        }

        while (!queue.isEmpty()) {
            int[] cur = queue.poll();
            int x = cur[0];
            int y = cur[1];

            for (int i = 0; i < 4 ; i++) {
                int nx = x + dx[i];
                int ny = y + dy[i];

                if (0 <= nx && nx < n && 0 <= ny && ny < m && copy[nx][ny] == 0) {
                    queue.offer(new int[] {nx,ny});
                    copy[nx][ny] = 2;
                }
            }
        }

        int count = 0;
        for (int i = 0 ; i < n ; i++) {
            for (int j = 0 ; j < m ; j++) {
                if (copy[i][j] == 0) {
                    count++;
                }
            }
        }

        return count;

    }

}