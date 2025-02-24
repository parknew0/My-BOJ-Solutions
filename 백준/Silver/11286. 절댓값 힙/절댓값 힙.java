
import java.io.*;
import java.util.Comparator;
import java.util.PriorityQueue;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(br.readLine());
        // -9와 5가 있다면 5가 우선, -9와 9가 있다면 -9 우선
        PriorityQueue<Integer> pq = new PriorityQueue<>(Comparator
                .comparing((Integer i) -> Math.abs(i))
                .thenComparing((Integer i) -> i));

        for (int i = 0; i < n; i++) {
            int input = Integer.parseInt(br.readLine());
            
            if (input != 0) pq.add(input);
            else if (input == 0 && pq.isEmpty()) bw.write("0\n");
            else if (input == 0 && !pq.isEmpty()) bw.write(pq.poll() + "\n");
        }

        bw.flush();
        bw.close();

    }
}