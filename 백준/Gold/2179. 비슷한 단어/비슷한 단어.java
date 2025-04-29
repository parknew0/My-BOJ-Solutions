import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb  = new StringBuilder();

        int n = Integer.parseInt(br.readLine());
        String[] orig = new String[n];
        for (int i = 0; i < n; i++) {
            orig[i] = br.readLine();
        }

        int bestLen    = 0;
        int bestFirst  = 0;
        int bestSecond = n > 1 ? 1 : 0;
        final int INF  = Integer.MAX_VALUE;

        Map<String, int[]> map = new HashMap<>();

        for (int i = 0; i < n; i++) {
            String w = orig[i];
            for (int j = 1, L = w.length(); j <= L; j++) {
                String pref = w.substring(0, j);
                int[] pair = map.get(pref);
                if (pair == null) {
                    pair = new int[]{i, INF};
                    map.put(pref, pair);
                } else if (pair[1] == INF) {
                    pair[1] = i;
                } else {
                    continue;
                }

                if (pair[1] < INF) {
                    if (j > bestLen
                     || (j == bestLen
                         && (pair[0] < bestFirst
                             || (pair[0] == bestFirst && pair[1] < bestSecond)))) {
                        bestLen    = j;
                        bestFirst  = pair[0];
                        bestSecond = pair[1];
                    }
                }
            }
        }

        sb.append(orig[bestFirst]).append('\n')
          .append(orig[bestSecond]);
        System.out.print(sb);
    }
}
