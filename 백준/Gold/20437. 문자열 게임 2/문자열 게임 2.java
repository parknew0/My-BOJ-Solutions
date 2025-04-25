import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int t = Integer.parseInt(br.readLine());
        while (t-- > 0) {
            String line = br.readLine();
            int k = Integer.parseInt(br.readLine());

            List<Integer>[] positions = new ArrayList[26];
            for (int i = 0 ; i < 26 ; i++) {
                positions[i] = new ArrayList<>();
            }

            for (int i = 0 ; i < line.length() ; i++) {
                char c = line.charAt(i);
                positions[c - 'a'].add(i);
            }

            int minLen = Integer.MAX_VALUE;
            int maxLen = -1;

            for (int i = 0 ; i < 26 ; i++) {
                List<Integer> list = positions[i];
                if (list.size() < k) continue;

                for (int j = 0 ; j < list.size() - k + 1 ; j++) {
                    int start = list.get(j);
                    int end = list.get(j + k - 1);
                    int len = end - start + 1;

                    minLen = Math.min(minLen, len);
                    maxLen = Math.max(maxLen, len);
                }
            }
            if (minLen == Integer.MAX_VALUE || maxLen == -1) {
                sb.append("-1").append("\n");
            } else {
                sb.append(minLen).append(" ").append(maxLen).append("\n");
            }
        }

        System.out.println(sb);
    }
}