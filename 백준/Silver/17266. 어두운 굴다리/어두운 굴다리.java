
import java.io.*;
import java.util.*;

public class Main {
    public static StringBuilder sb = new StringBuilder();
    public static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    public static void main(String[] args) throws IOException {
        int n = Integer.parseInt(br.readLine());
        int m = Integer.parseInt(br.readLine());
        int[] sensors = new int[m];
        String[] tokens = br.readLine().split(" ");
        for (int i = 0 ; i < m ; i++) {
            sensors[i] = Integer.parseInt(tokens[i]);
        }

        int low = 0, high = n;
        int result = -1;
        while (low <= high) {
            int mid = (low + high) / 2;

            if (solve(sensors, n, m, mid)) {
                high = mid - 1;
                result = mid;
            }
            else {
                low = mid + 1;
            }
        }

        System.out.print(result);
    }

    static public boolean solve (int[] sensors, int n, int m, int mid) {
        int[] coverage = new int[n * 2 + 1];

        for (int i = 0 ; i < m ; i++) {
            int left = Math.max(0, 2 * sensors[i] - 2 * mid);
            int right = Math.min(2 * n, 2 * sensors[i] + 2 * mid);

            coverage[left]++;
            if (right < 2 * n) {  // right가 끝점(n)이 아닐 때만 감소 표시
                coverage[right + 1]--;
            }
        }
        int sum = 0;
        for (int i = 0 ; i <= 2 * n ; i++) {
            sum += coverage[i];
            if (sum < 1) return false;
        }
        return true;

    }

}