
import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int k = Integer.parseInt(br.readLine());

        List<Integer>[] list = new ArrayList[n + 1];

        for (int i = 1; i <= n; i++) {
            list[i] = new ArrayList<>();
        }

        for (int i = 0; i < k; i++) {
            String[] tokens = br.readLine().split(" ");
            int first = Integer.parseInt(tokens[0]);
            int second = Integer.parseInt(tokens[1]);

            list[first].add(second);
            list[second].add(first);
        }

//        for (int i = 1; i <= n; i++) {
//            System.out.print(i + ":");
//            for (int j = 0; j < list[i].size(); j++) {
//                System.out.print(list[i].get(j) + " ");
//            }
//            System.out.println();
//        }

        Set<Integer> myset = new HashSet<>();
        Queue<Integer> queue = new LinkedList<>();
        Boolean[] visited = new Boolean[n + 1];
        Arrays.fill(visited, false);

        queue.add(1);
        visited[1] = true;
        while (!queue.isEmpty()) {
            int polled = queue.poll();
            int size = list[polled].size();

            myset.add(polled);
            for (int i = 0; i < size; i++) {
                if (!visited[list[polled].get(i)]) {
                    queue.add(list[polled].get(i));
                    visited[list[polled].get(i)] = true;
                }
            }
        }

        System.out.print(myset.size() - 1);
    }
}
