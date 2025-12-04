import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int X = Integer.parseInt(st.nextToken());

        int[] A = new int[N];
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            A[i] = Integer.parseInt(st.nextToken());
        }

        int minSum = Integer.MAX_VALUE;

        // 연속된 이틀(i, i+1)의 가격 합 중 최솟값 찾기
        for (int i = 0; i < N - 1; i++) {
            int currentSum = A[i] + A[i+1];
            minSum = Math.min(minSum, currentSum);
        }

        // 최솟값 * X 출력 (int 범위 내이나 안전하게 long 형변환)
        System.out.println((long) minSum * X);
    }
}