
import java.io.*;
import java.util.*;

public class Main {
    public static List<List<Integer>> list = new ArrayList<>();
    public static boolean[] parentFound;

    public static void main(String[] args) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine()); // 노드 개수
        for (int i = 0; i < n + 1; i++) {
            list.add(new ArrayList<>());
        }
        parentFound = new boolean[n + 1];

        // 간선을 노드수 - 1 만큼 입력받는 과정. 양방향 그래프처럼 입력함
        for (int i = 0; i < n - 1; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine(), " ");
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());

            list.get(a).add(b);
            list.get(b).add(a);
        }

        Map<Integer, Integer> cur_parent = new HashMap<>(); // 키: 자기자신, 밸류: 자기부모
        Deque<Integer> queue = new LinkedList<>();
        parentFound[1] = true;
        for (int i : list.get(1)) {
            if (!parentFound[i]) {
                parentFound[i] = true;
                cur_parent.put(i, 1);
                queue.add(i);
            }
        }
        bfs(queue, n, cur_parent );

        List<Map.Entry<Integer,Integer>> list2 = new ArrayList<>(cur_parent.entrySet());
        list2.sort(Comparator.comparing(Map.Entry::getKey));
        for (Map.Entry<Integer,Integer> entry : list2) {
            System.out.println(entry.getValue());
        }
    }

    public static void bfs(Deque<Integer> queue, int size, Map<Integer, Integer> cur_parent )
    {
        while (!queue.isEmpty()) {
            int parent = queue.poll();

            for (int i : list.get(parent)) {
                if (!parentFound[i]) {
                    parentFound[i] = true;
                    queue.add(i);
                    cur_parent.put(i, parent);
                }
            }
        }
    }

}
