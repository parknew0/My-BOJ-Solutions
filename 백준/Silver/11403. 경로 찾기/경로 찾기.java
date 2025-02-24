
import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        List<List<Integer>> list = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            String[] tokens = br.readLine().split(" ");
            list.add(new ArrayList<>());

            for (int j = 0; j < n; j++) {
                if (tokens[j].equals("1")) {
                    list.get(i).add(j);
                };
            }
        }
        
        int[][] visited = new int[n][n];
        for (int i = 0; i < n; i++) {
            bfs(visited, i,  list);
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(visited[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void bfs (int[][] visited, int lineNum, List<List<Integer>> list) {
        Deque<Integer> queue = new ArrayDeque<>();
        queue.offer(lineNum);

        while (!queue.isEmpty()) {
            int cur = queue.poll();

            for (int next: list.get(cur)) {
                if (visited[lineNum][next] == 0) {
                    queue.offer(next);
                    visited[lineNum][next] = 1;
                }
            }
        }

    }
}