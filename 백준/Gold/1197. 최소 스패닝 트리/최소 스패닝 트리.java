import java.io.*;
import java.util.*;

public class Main {
    public static int[] parents;

    public static void setup(int size) {
        parents = new int[size + 1];
        for (int i = 1 ; i <= size ; i++) {
            parents[i] = i;
        }
    }

    public static int find (int x) {
        if (parents[x] == x) {
            return x;
        }

        return parents[x] = find(parents[x]);
    }

    public static void union (int a, int b) {
        int A = find(a);
        int B = find(b);

        parents[B] = A;
    }

    public static void main (String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] tokens = br.readLine().split(" ");
        int v = Integer.parseInt(tokens[0]);
        int e = Integer.parseInt(tokens[1]);

        int[][] edges = new int[e][3];
        setup(v);
        for (int i = 0 ; i < e ; i++) {
            tokens = br.readLine().split(" ");
            int first = Integer.parseInt(tokens[0]);
            int second = Integer.parseInt(tokens[1]);
            int weight = Integer.parseInt(tokens[2]);

            edges[i] = new int[] {first,second,weight};
        }

        Arrays.sort(edges,(a,b) -> Integer.compare(a[2],b[2]));
        long sum = 0;
        for (int i = 0 ; i < e ; i++) {
            if (find(edges[i][0]) != find(edges[i][1])) {
                // System.out.println(find(edges[i][0]) + "그리고" + find(edges[i][1]));
                union(find(edges[i][0]),find(edges[i][1]));
                sum += edges[i][2];
            }
        }

        System.out.println(sum);

    }
}
