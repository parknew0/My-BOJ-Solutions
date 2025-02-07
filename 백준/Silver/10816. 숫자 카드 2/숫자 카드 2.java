
import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());

        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < n; i++) {
            int input = Integer.parseInt(st.nextToken());
            map.put(input, map.getOrDefault(input, 0) + 1);
        }

        int m = Integer.parseInt(br.readLine());
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < m; i++) {
            int key = Integer.parseInt(st.nextToken());
            Integer value = map.get(key);
            bw.write(((value == null) ? 0 : value) + " ");
        }
        bw.flush();
        bw.close();
    }
}
