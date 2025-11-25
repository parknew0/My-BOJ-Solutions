import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int N = Integer.parseInt(br.readLine());
        int count = 0;
        
        for (int i = 0; i < N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int s = Integer.parseInt(st.nextToken()); // BOJ 문제 수
            int c = Integer.parseInt(st.nextToken()); // Codeforces 레이팅
            int a = Integer.parseInt(st.nextToken()); // AtCoder 레이팅
            int r = Integer.parseInt(st.nextToken()); // ICPC 등수
            
            // 1. BOJ 1000문제 이상
            // 2. Codeforces 1600 이상
            // 3. AtCoder 1500 이상
            // 4. ICPC 30등 이내 (본선 진출 못한 경우 -1 제외)
            if (s >= 1000 || c >= 1600 || a >= 1500 || (r != -1 && r <= 30)) {
                count++;
            }
        }
        
        System.out.println(count);
    }
}