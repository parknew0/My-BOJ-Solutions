
import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        Queue<Integer> queue = new LinkedList<>();
        for (int i = 1; i <= n; i++) {
            queue.offer(i);
        }
        
        int result;
        while (queue.size() > 1) {
            queue.poll();
            result = queue.poll();
            queue.offer(result);
        }
    
        System.out.println(queue.poll());
    }
}
