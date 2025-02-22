import java.io.*;
import java.util.*;

public class Main {
    public static void main (String[] args) throws IOException
    {
        BufferedReader br = new BufferedReader (new InputStreamReader (System.in));
        String[] tokens = br.readLine().split(" ");
        int n = Integer.parseInt(tokens[0]);
        int m = Integer.parseInt(tokens[1]);
        List<Set<Integer>> adjacencyList = new ArrayList<>(); // n번 유저의 친구 리스트

        // 인덱스 0번은 안쓸 것
        for (int i = 0; i < n + 1; i++) {
            adjacencyList.add(new HashSet<>());
        }

        for (int i = 0; i < m; i++) {
            tokens = br.readLine().split(" ");
            int from = Integer.parseInt(tokens[0]);
            int to = Integer.parseInt(tokens[1]);

            adjacencyList.get(from).add(to);
            adjacencyList.get(to).add(from);
        }

        Map<Integer, Integer> baconMap = new HashMap<>();
        for (int i = 1; i <= n; i++) {
            Deque<Integer> queue = new ArrayDeque<>();
            boolean[] visited = new boolean[n + 1];
            queue.offer(i);
            visited[i] = true;

            Map<Integer, Integer> baconLevel = new HashMap<>();
            int level = 0;
            while (!queue.isEmpty()) {
                int size = queue.size();

                while (size-- > 0) {
                    int curr = queue.poll();
                    baconLevel.put(curr, level);
                    for (int friend : adjacencyList.get(curr)) {
                        if (!visited[friend]) {
                            queue.offer(friend);
                            visited[friend] = true;
                        }
                    }
                }
                level++;
            }

            int baconSum = 0;
            for (int individual : baconLevel.values()) {
                baconSum += individual;
            }
            baconMap.put(i, baconSum);
        }

        List<Map.Entry<Integer, Integer>> mapList = new ArrayList<>(baconMap.entrySet());
        mapList.sort(Comparator
                .comparing(Map.Entry<Integer, Integer>::getValue)
                .thenComparing(Map.Entry<Integer, Integer>::getKey));

        System.out.println(mapList.get(0).getKey());

    }

}