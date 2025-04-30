import java.io.*;
import java.util.*;

public class Main {
    static int[] parent;

    static void makeSet(int n) {
        parent = new int[n + 1];
        for (int i = 0; i <= n; i++) {
            parent[i] = i;
        }
    }

    static int find(int x) {
        if (parent[x] == x) {
            return x;
        }
        return parent[x] = find(parent[x]);
    }

    static void union(int a, int b) {
        int rootA = find(a);
        int rootB = find(b);
        if (rootA != rootB) {
            parent[rootB] = rootA;
        }
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb  = new StringBuilder();

        String[] tokens = br.readLine().split(" ");

        int n = Integer.parseInt(tokens[0]);
        int m = Integer.parseInt(tokens[1]);

        makeSet(n);

        for (int i = 0 ; i < m ; i++) {
            tokens = br.readLine().split(" ");
            int cmd = Integer.parseInt(tokens[0]);
            int a = Integer.parseInt(tokens[1]);
            int b = Integer.parseInt(tokens[2]);

            if (cmd == 0) union(a, b);
            else {
                if (find(a) == find(b)) sb.append("YES").append("\n");
                else sb.append("NO").append("\n");
            }
        }

        System.out.println(sb);
    }
}
