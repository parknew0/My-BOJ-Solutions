import java.io.*;
import java.util.*;

public class Main {
    static int[] arr;
    static int[] seg;  // 세그먼트 트리 배열
    static int n;
    
    public static void main(String[] args) throws Exception {
        // 빠른 입력을 위해 BufferedReader 사용
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        
        n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        
        arr = new int[n];
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++){
            arr[i] = Integer.parseInt(st.nextToken());
        }
        
        // 세그먼트 트리의 크기는 보통 4*n 정도 잡음
        seg = new int[4 * n];
        build(0, n - 1, 1);
        
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < m; i++){
            st = new StringTokenizer(br.readLine());
            int L = Integer.parseInt(st.nextToken()) - 1;
            int R = Integer.parseInt(st.nextToken()) - 1;
            int result = query(0, n - 1, 1, L, R);
            sb.append(result).append("\n");
        }
        System.out.print(sb);
    }
    
    // 구간 [start, end]에 해당하는 노드 idx를 구성하면서 세그먼트 트리를 구축하는 함수
    static int build(int start, int end, int idx) {
        if(start == end) {
            seg[idx] = arr[start];
            return seg[idx];
        }
        int mid = (start + end) / 2;
        seg[idx] = build(start, mid, idx * 2) + build(mid + 1, end, idx * 2 + 1);
        return seg[idx];
    }
    
    // 세그먼트 트리를 이용해 구간 [L, R]의 합을 구하는 함수
    static int query(int start, int end, int idx, int L, int R) {
        // 구간이 겹치지 않는 경우
        if(R < start || end < L) return 0;
        // [start, end]가 완전히 [L, R] 안에 들어오는 경우 → 이미 캐싱된 값을 사용
        if(L <= start && end <= R) return seg[idx];
        
        int mid = (start + end) / 2;
        return query(start, mid, idx * 2, L, R) + query(mid + 1, end, idx * 2 + 1, L, R);
    }
}
