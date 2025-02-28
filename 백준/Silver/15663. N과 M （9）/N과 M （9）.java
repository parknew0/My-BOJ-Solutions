
import java.io.*;
import java.util.*;

public class Main {
    public static int n;
    public static int m;
    public static int[] arr;
    public static boolean[] visited;
    public static int[] index;
    public static Set<String> set = new HashSet<>();
    public static StringBuilder sb;

    public static void main(String[] args) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] tokens = br.readLine().split(" ");
        n = Integer.parseInt(tokens[0]);
        m = Integer.parseInt(tokens[1]);
        arr = new int[n];
        visited = new boolean[n];
        index = new int[m];

        tokens = br.readLine().split(" ");
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(tokens[i]);
        }
        Arrays.sort(arr);


        solve(0);
    }

    public static void solve(int depth) {
        if (depth == m) {
            sb = new StringBuilder();
            for (int i = 0; i < m; i++) {
                sb.append(arr[index[i]]).append(" ");
            }

            if (set.contains(sb.toString())) {
                return;
            }
            else {
                set.add(sb.toString());
                System.out.println(sb.toString());
            }
            return;
        }

        for (int i = 0; i < n; i++) {
            if (visited[i]) continue;

            index[depth] = i;
            visited[i] = true;
            solve(depth + 1);
            visited[i] = false;
        }
    }
}
