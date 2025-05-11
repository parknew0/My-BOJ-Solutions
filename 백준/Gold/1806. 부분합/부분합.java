import java.io.*;
import java.util.*;

public class Main {
    public static void main (String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int s = Integer.parseInt(st.nextToken());
        int[] arr = new int[n];
        st = new StringTokenizer(br.readLine());

        int totalSum = 0;
        for (int i = 0 ; i < n ; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
            totalSum += arr[i];
        }

        if (totalSum < s) {
            System.out.println(0);
            return;
        }

        int l = 0, r = 0, lowestCount = Integer.MAX_VALUE;
        long sum = 0;

        while (r < n) {
            sum += arr[r];
            // sum이 S 이상인 동안
            while (sum >= s) {
                // (1) 현재 구간 [l..r]의 길이로 최소 갱신
                lowestCount = Math.min(lowestCount, r - l + 1);
                // (2) 왼쪽 한 칸 빼고 수축
                sum -= arr[l];
                l++;
            }
            r++;
        }

        System.out.println(lowestCount);

    }
}
