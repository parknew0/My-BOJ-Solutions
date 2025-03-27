

import java.io.*;
import java.util.*;

public class Main {
    public static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    public static StringBuilder sb = new StringBuilder();
    public static TreeSet<Integer> set = new TreeSet<>();
    public static List<Integer> list;
    public static int[] index;
    static int n, m;

    public static void main(String[] args) throws IOException {
        String[] tokens = br.readLine().split(" ");
        n = Integer.parseInt(tokens[0]);
        m = Integer.parseInt(tokens[1]);
        tokens = br.readLine().split(" ");
        for (int i = 0 ; i < n ; i++) {
            int item = Integer.parseInt(tokens[i]);
            set.add(item);
        }
        list = new ArrayList<>(set);
        index = new int[m];

        solve(0);

        System.out.print(sb);
    }


    public static void solve (int depth) {
        if (depth == m) {
            for (int i = 0 ; i < m ; i++) {
                sb.append(list.get(index[i]));
                if (i < m - 1) sb.append(" ");
            }
            sb.append("\n");
            return;
        }

        for (int i = 0 ; i < list.size() ; i++) {
            index[depth] = i;
            solve(depth + 1);
        }
    }
}