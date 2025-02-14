import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        // 빠른 입력을 위해 BufferedReader 사용
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        
        // 누적합 배열 (1-indexing으로 처리하기 위해 크기를 N+1로 설정)
        long[] prefix = new long[N + 1];
        
        st = new StringTokenizer(br.readLine());
        for (int i = 1; i <= N; i++) {
            // prefix[i]는 1번째 원소부터 i번째 원소까지의 합
            prefix[i] = prefix[i - 1] + Integer.parseInt(st.nextToken());
        }
        
        StringBuilder sb = new StringBuilder();
        for (int q = 0; q < M; q++) {
            st = new StringTokenizer(br.readLine());
            int L = Integer.parseInt(st.nextToken());
            int R = Integer.parseInt(st.nextToken());
            
            // [L, R] 구간의 합 = prefix[R] - prefix[L - 1]
            sb.append(prefix[R] - prefix[L - 1]).append("\n");
        }
        
        System.out.print(sb);
    }
}
