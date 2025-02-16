
import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        PriorityQueue<Integer> minHeap = new PriorityQueue<>();
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < n; i++) {
            int input = Integer.parseInt(br.readLine());
            Integer m;
            if (input == 0) {
                if ((m = minHeap.poll()) == null){
                    sb.append(0).append("\n");
                }
                else {
                    sb.append(m).append("\n");
                }
            }
            else {
                minHeap.offer(input);
            }
        }
        System.out.println(sb);
    }
}
