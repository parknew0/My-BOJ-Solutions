
import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        PriorityQueue<Integer> maxHeap = new PriorityQueue<>(Collections.reverseOrder());

        for (int i = 0; i < n; i++) {
            int input = Integer.parseInt(br.readLine());

            if (input == 0 && maxHeap.isEmpty()) bw.write(0 + "\n");
            else if (input == 0 && !maxHeap.isEmpty()) bw.write(maxHeap.poll() + "\n");
            else maxHeap.offer(input);
        }

        bw.flush();
        bw.close();
    }
}
