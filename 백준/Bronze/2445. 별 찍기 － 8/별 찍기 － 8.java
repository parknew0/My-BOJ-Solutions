import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        
        // 입력을 받기 위한 BufferedReader 설정
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        
        // 출력을 효율적으로 처리하기 위한 StringBuilder 생성
        StringBuilder sb = new StringBuilder();
        
        // 윗부분 패턴 만들기 (1번째 줄부터 N번째 줄까지)
        for (int i = 1; i <= N; i++) {
            // 왼쪽 별
            for (int j = 1; j <= i; j++) {
                sb.append("*");
            }
            // 가운데 공백
            for (int k = 1; k <= 2 * (N - i); k++) {
                sb.append(" ");
            }
            // 오른쪽 별
            for (int j = 1; j <= i; j++) {
                sb.append("*");
            }
            // 줄 바꿈
            sb.append("\n");
        }
        
        // 아랫부분 패턴 만들기 (N-1번째 줄 패턴부터 1번째 줄 패턴까지)
        for (int i = N - 1; i >= 1; i--) {
            // 왼쪽 별
            for (int j = 1; j <= i; j++) {
                sb.append("*");
            }
            // 가운데 공백
            for (int k = 1; k <= 2 * (N - i); k++) {
                sb.append(" ");
            }
            // 오른쪽 별
            for (int j = 1; j <= i; j++) {
                sb.append("*");
            }
            // 줄 바꿈
            sb.append("\n");
        }
        
        // 최종 결과 출력
        System.out.print(sb);
    }
}