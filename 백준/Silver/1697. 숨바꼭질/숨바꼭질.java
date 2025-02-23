
import java.io.*;
import java.util.*;

public class Main {
    static final int MAXINDEX = 100000;
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();  // 수빈이 위치
        int K = sc.nextInt();  // 동생 위치

        Deque<Integer> queue = new ArrayDeque<>();
        boolean[] visited = new boolean[MAXINDEX + 1];
        queue.offer(N);
        visited[N] = true;
        int level = 0;
        while(!queue.isEmpty()) {
            int levelSize = queue.size();

            while (levelSize-- > 0) {
                int curr = queue.poll();

                if(curr == K) {
                    System.out.println(level);
                    return;
                }

                int doubledNext = curr * 2;
                int incrementedNext = curr + 1;
                int decrementedNext = curr -1;

                if ( 0 <= doubledNext && doubledNext <= MAXINDEX && !visited[doubledNext]) {
                    visited[doubledNext] = true;
                    queue.offer(doubledNext);
                }
                if ( 0 <= incrementedNext && incrementedNext <= MAXINDEX && !visited[incrementedNext]) {
                    visited[incrementedNext] = true;
                    queue.offer(incrementedNext);
                }
                if ( 0 <= decrementedNext && decrementedNext <= MAXINDEX && !visited[decrementedNext]) {
                    visited[decrementedNext] = true;
                    queue.offer(decrementedNext);
                }
            }
            level++;
        }
    }
}
