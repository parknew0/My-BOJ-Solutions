
import java.io.*;
import java.util.*;

public class Main {
    public static void bfs(int start) {
        Queue<Integer> queue = new LinkedList<>(); // BFS 큐
        Map<Integer, Integer> parent = new HashMap<>(); // 부모 노드 저장 (경로 추적용)
        Set<Integer> visited = new HashSet<>(); // 방문 체크

        queue.offer(start);
        visited.add(start);
        parent.put(start, -1); // 시작 노드는 부모 없음

        while (!queue.isEmpty()) {
            int node = queue.poll();

            // 1에 도달하면 경로 출력 후 종료
            if (node == 1) {
                printPath(parent, start, node);
                return;
            }

            // 다음 가능한 연산 수행 (메모리를 줄이기 위해 그래프 저장 X)
            List<Integer> nextNodes = new ArrayList<>();
            if (node % 3 == 0) nextNodes.add(node / 3);
            if (node % 2 == 0) nextNodes.add(node / 2);
            nextNodes.add(node - 1);

            // BFS 탐색 (이미 방문한 노드는 큐에 넣지 않음)
            for (int next : nextNodes) {
                if (!visited.contains(next)) {
                    queue.offer(next);
                    visited.add(next);
                    parent.put(next, node); // 부모 설정
                }
            }
        }
    }

    // 1이 나왔을 때 경로 출력하는 함수
    public static void printPath(Map<Integer, Integer> parent, int start, int end) {
        List<Integer> path = new ArrayList<>();
        int current = end;

        while (current != start) {
            path.add(current);
            current = parent.get(current);
        }
        path.add(start);
        Collections.reverse(path);

                System.out.println(path.size() - 1);
        for (int p : path) {
            System.out.print(p + " ");
        }
    }

    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        bfs(n);
    }
}
