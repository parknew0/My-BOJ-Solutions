import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        List<Long> dp = new ArrayList<>();
        StringBuilder sb = new StringBuilder();

        dp.add(-1L); // 인덱스 1번부터 쓸거라서 쓰레기값 넣어 둠
        dp.add(1L);
        dp.add(1L);
        dp.add(1L);
        dp.add(2L);
        dp.add(2L);

        int max = 5;
        int start = 6;
        for (int i = 0; i < t; i++) {
            int n = Integer.parseInt(br.readLine());
            if (n <= max) {
                sb.append(dp.get(n)).append("\n");
                continue;
            }

            for (int j = start; j <= n; j++) {
                dp.add(dp.get(j-5) + dp.get(j-1));
            }
            sb.append(dp.get(n)).append("\n");
            start = n + 1;
            max = n;
        }

        System.out.print(sb);
    }
}
