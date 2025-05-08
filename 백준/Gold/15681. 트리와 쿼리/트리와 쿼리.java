import java.util.*;
import java.io.*;

public class Main {
    public static ArrayList<ArrayList<Integer>> tree;
    public static int[] subTreeNums;
    public static boolean[] visited;

    public static void main (String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        StringBuilder sb = new StringBuilder();

        int n = Integer.parseInt(st.nextToken());
        int r = Integer.parseInt(st.nextToken());
        int q = Integer.parseInt(st.nextToken());

        tree = new ArrayList<>();
        for (int i = 0 ; i < n + 1 ; i++) {
            tree.add(new ArrayList<>());
        }

        for (int i = 0 ; i < n - 1 ; i++) {
            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());

            tree.get(a).add(b);
            tree.get(b).add(a);
        }

        subTreeNums = new int[n + 1];
        visited = new boolean[n + 1];

        calculateSubtrees(r);

        for (int i = 0 ; i < q ; i++) {
            int subtreeRoot = Integer.parseInt(br.readLine());
            int subNodes = subTreeNums[subtreeRoot];
            sb.append(subNodes).append("\n");
        }

        System.out.println(sb);
    }

    public static int calculateSubtrees (int node) {
        visited[node] = true;
        int size = 1;

        for (int subNode : tree.get(node)) {
            if (!visited[subNode]) {
                size += calculateSubtrees(subNode);
            }
        }

        subTreeNums[node] = size;
        return size;
    }
}