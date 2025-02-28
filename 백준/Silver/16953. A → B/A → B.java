
import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException
    {
      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
      String[] tokens = br.readLine().split(" ");
      long a = Integer.parseInt(tokens[0]);
      long b = Integer.parseInt(tokens[1]);

      System.out.print(bfs(a, b));
    }

    public static int bfs (long a, long b) {
        Deque<Long> queue = new ArrayDeque<>();
        queue.offer(a);
        int level = 1;

        long cur = -1;
        boolean found = false;
        while (!queue.isEmpty()) {
            int size = queue.size();

            while (size-- > 0) {
                cur = queue.poll();
                if (cur > b) {continue;}
                if (cur == b) {
                    found = true;
                    break;
                }
                queue.offer(cur * 2);
                StringBuilder sb = new StringBuilder();
                sb.append(cur).append(1);
                queue.offer(Long.parseLong(sb.toString()));
            }
            if (found) {break;}
            level++;

        }

        if (cur == b) { return level; }
        else return -1;

    }
}
