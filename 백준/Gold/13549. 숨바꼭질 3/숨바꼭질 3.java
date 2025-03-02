
import java.io.*;
import java.util.*;
import java.math.*;

public class Main {
    public static void main(String[] args) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] tokens = br.readLine().split(" ");
        int n = Integer.parseInt(tokens[0]);
        int m = Integer.parseInt(tokens[1]);

        Deque<int[]> queue = new ArrayDeque<>();
        Set<Integer> visited = new HashSet<>();

        queue.offer(new int[] {n, 0}); // 시작위치, 경과시간
        int result = -1;

        while(!queue.isEmpty()) {
            int[] cur = queue.poll();
            int location = cur[0];
            int time = cur[1];
            
            if (location < 0 || location > 100000 || visited.contains(location)) continue;
            visited.add(location);

            //System.out.println(location + " " + time);
            if (m == location) {
                result = time;
                break;
            }

            queue.offer(new int[] {location - 1, time + 1});
            queue.offer(new int[] {location * 2, time});
            queue.offer(new int[] {location + 1, time + 1});

        }

        System.out.print(result);
    }
}
