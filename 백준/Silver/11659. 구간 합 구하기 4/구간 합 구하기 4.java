import java.io.*;
import java.util.*;

public class Main {
    static int[] arr;
    static Map<String, Integer> memo; // 구간 합을 저장하는 Map

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        
        arr = new int[N];
        memo = new HashMap<>();
        
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }
        
        StringBuilder sb = new StringBuilder();
        for (int q = 0; q < M; q++) {
            st = new StringTokenizer(br.readLine());
            int L = Integer.parseInt(st.nextToken()) - 1;
            int R = Integer.parseInt(st.nextToken()) - 1;
            
            sb.append(getSum(L, R)).append("\n");
        }
        System.out.print(sb);
    }

    // 구간 [L, R]의 합을 반환하는 함수 (캐싱 적용)
    static int getSum(int L, int R) {
        String key = L + "," + R; // 구간을 문자열 키로 저장
        if (memo.containsKey(key)) {
            return memo.get(key); // 기존에 계산한 값이 있으면 재사용
        }

        int sum = 0;
        for (int i = L; i <= R; i++) {
            sum += arr[i];
        }

        memo.put(key, sum); // 계산한 값을 저장하여 재사용
        return sum;
    }
}
