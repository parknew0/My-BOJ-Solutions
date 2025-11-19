import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.BufferedWriter;
import java.io.OutputStreamWriter;
import java.io.IOException;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        // 빠른 입출력을 위한 BufferedReader와 BufferedWriter 사용
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        // 테스트 케이스의 수 T를 읽음
        int T = Integer.parseInt(br.readLine());
        
        // T번의 테스트 케이스 반복
        for (int t = 0; t < T; t++) {
            // 한 줄에서 a, b, c를 읽음
            StringTokenizer st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            int c = Integer.parseInt(st.nextToken());
            
            // 조건을 만족하는 쌍의 개수를 저장할 변수
            int count = 0;
            
            // 1 <= x <= a 범위의 x에 대해 반복
            for (int x = 1; x <= a; x++) {
                // 1 <= y <= b 범위의 y에 대해 반복
                for (int y = 1; y <= b; y++) {
                    // 1 <= z <= c 범위의 z에 대해 반복
                    for (int z = 1; z <= c; z++) {
                        // 조건: (x mod y) = (y mod z) = (z mod x)
                        int r1 = x % y;
                        int r2 = y % z;
                        int r3 = z % x;
                        
                        // 세 나머지가 모두 같은지 확인
                        if (r1 == r2 && r2 == r3) {
                            count++; // 조건을 만족하면 개수 증가
                        }
                    }
                }
            }
            
            // 결과 출력
            bw.write(count + "\n");
        }
        
        // 남아있는 출력을 모두 내보냄
        bw.flush();
        // 스트림 닫기
        bw.close();
        br.close();
    }
}