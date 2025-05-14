import java.io.*;
import java.util.*;

public class Main {
    public static int[] dx = {-1, 1, 0, 0};
    public static int[] dy = {0, 0, -1, 1};
    public static int[][] map;
    public static boolean[][][] visited; // broke, x, y

    public static class Node {
        int x;
        int y;
        int broke;
        int depth;

        public Node (int x, int y, int broke, int depth) {
            this.x = x;
            this.y = y;
            this.broke = broke;
            this.depth = depth;
        }
    }

    public static void main (String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] tokens = br.readLine().split(" ");
        int n = Integer.parseInt(tokens[0]);
        int m = Integer.parseInt(tokens[1]);
        map = new int[n + 1][m + 1];
        visited = new boolean[2][n + 1][m + 1];

        for (int i = 0 ; i < n ; i++) {
            String line = br.readLine();
            for (int j = 0 ; j < m ; j++) {
                int num = line.charAt(j) - '0';
                map[i + 1][j + 1] = num;
            }
        }

        Deque<Node> queue = new ArrayDeque<>();
        queue.offer(new Node(1, 1, 0, 1));

        int res = -1;
        while(!queue.isEmpty()) {
            Node cur = queue.poll();
            // System.out.println(cur.x +" "+cur.y+" "+cur.depth);
            if (cur.x == n && cur.y == m) {
                res = cur.depth;
                break;
            }

            for (int i = 0 ; i < 4 ; i++) {
                int nx = cur.x + dx[i];
                int ny = cur.y + dy[i];

                if (nx < 1 || nx > n || ny < 1 || ny > m) continue;

                if (map[nx][ny] == 1 && cur.broke == 0) {
                    if (!visited[1][nx][ny]) {
                        visited[1][nx][ny] = true;
                        queue.offer(new Node(nx, ny, 1, cur.depth + 1));
                    }
                }

                if (map[nx][ny] == 0) {
                    if (!visited[cur.broke][nx][ny]) {
                        visited[cur.broke][nx][ny] = true;
                        queue.offer(new Node(nx, ny, cur.broke, cur.depth + 1));
                    }
                }

            }
        }

        System.out.println(res);

    }
}
