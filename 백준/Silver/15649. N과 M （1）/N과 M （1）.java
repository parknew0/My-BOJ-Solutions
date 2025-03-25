
import java.io.*;
import java.util.*;

public class Main {
    public static int n;
    public static int m;
    public static List<Integer> list = new ArrayList<>();
    public static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] tokens = br.readLine().split(" ");
        n = Integer.parseInt(tokens[0]);
        m = Integer.parseInt(tokens[1]);

        solve(0);

        System.out.print(sb);
    }

    public static void solve (int depth) {
        if (depth == m) {
            for (int i : list) {
                sb.append(i).append(" ");
            }
            sb.append("\n");

            return;
        }

        for (int i = 1 ; i <= n ; i++) {
            if (!list.contains(i)) list.add(i);
            else continue;
            
            solve(depth + 1);
            list.remove((Integer)i);
        }
    }
}