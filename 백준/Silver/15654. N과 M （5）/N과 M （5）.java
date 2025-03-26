
import java.io.*;
import java.util.*;

public class Main {
    public static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    public static StringBuilder sb = new StringBuilder();
    public static int[] input;
    public static int[] result;
    public static boolean[] used;
    static int n, m;

    public static void main(String[] args) throws IOException {
        String[] tokens = br.readLine().split(" ");
        n = Integer.parseInt(tokens[0]);
        m = Integer.parseInt(tokens[1]);
        input = new int[n];
        tokens = br.readLine().split(" ");
        for (int i = 0 ; i < n ; i++) {
            input[i] = Integer.parseInt(tokens[i]);
        }
        Arrays.sort(input);
        result = new int[m];
        used = new boolean[n];

        solve(0);

        System.out.print(sb);
    }

    public static void solve (int depth) {
        if (depth == m) {
            for (int i = 0 ; i < m ; i++) {
                sb.append(input[result[i]]);
                if (i < m - 1) sb.append(" ");
            }
            sb.append("\n");
            return;
        }

        for (int i = 0 ; i < n ; i++) {
            if (!used[i]){
                used[i] = true;
                result[depth] = i;
                solve(depth + 1);
                used[i] = false;
            }

        }

    }
}