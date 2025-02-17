

import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = br.readLine();
        int n = Integer.parseInt(input.split(" ")[0]);
        int m = Integer.parseInt(input.split(" ")[1]);

        // List안에 Set 넣는 게 더 안전해보이지만, 입력값이 올바를거라 믿음
        List<List<Integer>> vertices = new ArrayList<>();
        // 1부터 n까지 쓸거라서 get(0)에 해당하는 부분을 미리 만들어준다.
        vertices.add(new ArrayList<>());
        for (int i = 0; i < n; i++) {
            vertices.add(new ArrayList<>());
        }

        for (int i = 0; i < m; i++) {
            input = br.readLine();
            int a = Integer.parseInt(input.split(" ")[0]);
            int b = Integer.parseInt(input.split(" ")[1]);

            vertices.get(a).add(b);
            vertices.get(b).add(a);
        }

        boolean[] visited = new boolean[n + 1];
        int count = 0;
        for (int i = 1; i < n + 1; i++) {
            if (!visited[i]){
                bfs(i, vertices, visited);
                count++;
            }
        }
        System.out.println(count);
    }

    public static void bfs (int verticeIndex, List<List<Integer>> vertices, boolean[] visited) {
        Deque<Integer> queue = new ArrayDeque<>();

        queue.add(verticeIndex);
        visited[verticeIndex] = true;

        while (!queue.isEmpty()) {
            int curr = queue.poll();

            for (int nextVertex : vertices.get(curr)) {
                if(!visited[nextVertex]){
                    queue.push(nextVertex);
                    visited[nextVertex] = true;
                }
            }
        }
    }
}
