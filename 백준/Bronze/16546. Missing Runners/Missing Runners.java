import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        // 입력을 빠르게 받기 위해 BufferedReader 사용
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        // 총 주자의 수 N을 입력받음
        int n = Integer.parseInt(br.readLine());

        // 1부터 N까지 모든 주자의 번호 합을 계산
        // N이 클 경우 합이 int 범위를 넘을 수 있으므로 long 타입 사용
        long totalSum = (long) n * (n + 1) / 2;

        // 완주한 주자들의 번호를 입력받기 위해 StringTokenizer 사용
        StringTokenizer st = new StringTokenizer(br.readLine());
        
        // 완주한 주자(N-1명)들의 번호를 합계에서 빼줌
        for (int i = 0; i < n - 1; i++) {
            int finishedRunner = Integer.parseInt(st.nextToken());
            totalSum -= finishedRunner;
        }

        // 합계에 남아있는 마지막 번호가 완주하지 못한 주자의 번호
        System.out.println(totalSum);
    }
}