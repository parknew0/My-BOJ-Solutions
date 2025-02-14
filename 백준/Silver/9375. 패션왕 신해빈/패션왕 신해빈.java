
import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();

        for (int tc = 0; tc < t; tc++) {
            int n = Integer.parseInt(br.readLine());
            Map<String, Integer> categoryCount = new HashMap<>();
            
            // 각 아이템의 카테고리별 개수를 센다.
            for (int i = 0; i < n; i++) {
                String[] tokens = br.readLine().split(" ");
                String category = tokens[1];
                categoryCount.put(category, categoryCount.getOrDefault(category, 0) + 1);
            }
            
            // 각 카테고리에서 (아이템 수 + 1) 을 곱하고, 아무것도 선택하지 않는 경우 1을 빼준다.
            long ways = 1;
            for (int count : categoryCount.values()) {
                ways *= (count + 1);
            }
            ways -= 1;
            
            sb.append(ways).append("\n");
        }
        System.out.println(sb);
    }
}
