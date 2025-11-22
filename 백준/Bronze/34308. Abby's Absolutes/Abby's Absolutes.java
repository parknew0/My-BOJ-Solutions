import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        // 입력을 빠르게 받기 위해 BufferedReader 사용
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        
        // 첫 번째 줄 입력 (N: 상한값, K: 쇼핑 횟수)
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());
        
        // 두 번째 줄 입력 (각 쇼핑에서 원했던 사과 개수)
        st = new StringTokenizer(br.readLine());
        
        for (int i = 0; i < K; i++) {
            int want = Integer.parseInt(st.nextToken());
            
            // 거리 계산
            // 1과의 거리: |want - 1|
            // N과의 거리: |want - N|
            int distTo1 = Math.abs(want - 1);
            int distToN = Math.abs(want - N);
            
            // 상한값(N)에 더 가까우면(거리가 더 작으면) N개 구매
            // 거리가 같거나 1에 더 가까우면 1개 구매
            if (distToN < distTo1) {
                sb.append(N).append(" ");
            } else {
                sb.append(1).append(" ");
            }
        }
        
        // 결과 출력 (마지막 공백 제거 후 출력)
        System.out.println(sb.toString().trim());
    }
}