import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        // 테스트 케이스의 개수 T
        int T = Integer.parseInt(br.readLine());
        
        StringBuilder sb = new StringBuilder();
        
        for (int i = 0; i < T; i++) {
            // 공백으로 구분된 숫자들을 문자열 배열로 읽기
            String[] numbers = br.readLine().split(" ");
            
            int sum = 0;
            // 배열을 순회하며 각 숫자를 정수로 변환하여 더하기
            for (String numStr : numbers) {
                sum += Integer.parseInt(numStr);
            }
            
            // 결과 StringBuilder에 추가
            sb.append(sum).append("\n");
        }
        
        // 모든 결과 한 번에 출력
        System.out.print(sb);
    }
}