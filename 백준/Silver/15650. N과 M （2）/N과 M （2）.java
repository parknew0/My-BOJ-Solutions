
import java.io.*;
import java.util.*;

public class Main {
    public static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    public static StringBuilder sb = new StringBuilder();
    public static int[] result;
    static int n, m;

    public static void main(String[] args) throws IOException {
        String[] tokens = br.readLine().split(" ");
        n = Integer.parseInt(tokens[0]);
        m = Integer.parseInt(tokens[1]);
        result = new int[m];

        solve(1, 0);

        System.out.print(sb);
    }

    public static void solve (int start, int depth) {
        if (depth == m) {
            for (int i = 0 ; i < m ; i++) {
                sb.append(result[i]);
                if (i < m - 1) sb.append(" ");
            }
            sb.append("\n");
            return;
        }

        for (int i = start ; i <= n ; i++) {
            result[depth] = i;
            solve(i + 1, depth + 1);
        }

    }
}