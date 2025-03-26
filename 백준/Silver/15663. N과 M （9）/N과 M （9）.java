
import java.io.*;
import java.util.*;

public class Main {
    public static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    public static StringBuilder sb = new StringBuilder();
    public static int[] arr;
    public static int[] index;
    public static boolean[] used;
    static int n, m;

    public static void main(String[] args) throws IOException {
        String[] tokens = br.readLine().split(" ");
        n = Integer.parseInt(tokens[0]);
        m = Integer.parseInt(tokens[1]);
        arr = new int[n];
        tokens = br.readLine().split(" ");
        for (int i = 0 ; i < n ; i++) {
            arr[i] = Integer.parseInt(tokens[i]);
        }
        Arrays.sort(arr);
        index = new int[m];
        used = new boolean[n];

        solve(0);

        System.out.print(sb);
    }

    public static void solve (int depth) {
        if (depth == m) {
            for (int i = 0 ; i < m ; i++) {
                sb.append(arr[index[i]]);
                if (i < m - 1) sb.append(" ");
            }
            sb.append("\n");
            return;
        }

        for (int i = 0 ; i < n ; i++) {
            if (used[i]) continue;
            if (i > 0 && arr[i] == arr[i - 1] && !used[i - 1]) continue;

            used[i] = true;
            index[depth] = i;
            solve(depth + 1);
            used[i] = false;

        }
    }
}