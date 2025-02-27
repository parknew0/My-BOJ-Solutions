import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        // 빠른 입력을 위해 BufferedReader 사용
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        
        // 각 노드의 인접 리스트(연결된 노드들을 저장)
        ArrayList<Integer>[] tree = new ArrayList[N + 1];
        for (int i = 1; i <= N; i++) {
            tree[i] = new ArrayList<>();
        }
        
        // 트리의 간선 정보를 입력받아서 양방향으로 저장
        for (int i = 0; i < N - 1; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            tree[a].add(b);
            tree[b].add(a);
        }
        
        // 각 노드의 부모 정보를 저장할 배열 (1번 노드는 루트이므로 부모가 없음)
        int[] parent = new int[N + 1];
        
        // BFS를 위한 큐 초기화
        Queue<Integer> queue = new LinkedList<>();
        queue.add(1);
        // 루트 노드(1번)는 방문 표시를 위해 0(또는 다른 값)으로 처리. 
        // 여기서는 parent 배열의 기본값인 0을 루트의 부모로 사용하며, 방문 여부 판별에도 활용
        parent[1] = 0;
        
        // BFS 탐색: 큐가 빌 때까지 반복
        while (!queue.isEmpty()) {
            int current = queue.poll();
            // 현재 노드와 연결된 모든 노드 확인
            for (int next : tree[current]) {
                // 아직 방문하지 않은 노드라면 (단, 1번 노드는 루트이므로 예외 처리)
                if (parent[next] == 0 && next != 1) {
                    parent[next] = current; // 부모 노드를 current로 지정
                    queue.add(next);
                }
            }
        }
        
        // StringBuilder를 이용해 출력 문자열을 한 번에 만들기
        StringBuilder sb = new StringBuilder();
        for (int i = 2; i <= N; i++) {
            sb.append(parent[i]).append("\n");
        }
        System.out.print(sb);
    }
}
