
import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] tokens = br.readLine().split(" ");

        int n = Integer.parseInt(tokens[0]); // 아이들 수
        int m = Integer.parseInt(tokens[1]); // 보석 종류
        int[] gems = new int[m];

        int max = 0;
        for (int i = 0; i < m; i++) {
            gems[i] = Integer.parseInt(br.readLine());
            max = Math.max(gems[i], max);
        }

        int low = 1;
        int high = max;
        int res = -1;
        while (low <= high) {
            int mid = (low + high) / 2;
            int sum = 0;

            for (int i = 0; i < m; i++) {
                sum += (gems[i] + mid - 1) / mid;
                if (sum > n) break;
            }

            if (sum > n) { // 질투심을 mid로써 최소로 만드려면 나눠줄 사람이 더 필요하다. 예상 mid 높여야 현재원으로도 커버됨
                low = mid + 1;
            }
            else {
                res = mid;
                high = mid - 1;
            }
        }

        System.out.print(res);
    }
}
