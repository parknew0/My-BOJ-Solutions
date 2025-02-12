
import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        Queue<Integer> queue = new LinkedList<>();
        queue.offer(n);

        int level = 0;
        while (!queue.isEmpty()) {
            int levelSize = queue.size();
            boolean flag = false;

            //System.out.println("level " + level);
            for (int i = 0; i < levelSize; i++) {
                int next = queue.poll();
                //System.out.println(next);
                if (next == 1) {
                    flag = true;
                    break;
                }

                if (next % 3 == 0) {
                    queue.add( next / 3);
                }
                if (next % 2 == 0) {
                    queue.add( next / 2);
                }
                queue.add( next - 1);
            }

            level++;
            if(flag) break;
        }
        System.out.println(level - 1);
    }
}
