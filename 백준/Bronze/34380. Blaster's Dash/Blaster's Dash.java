import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        
        // 입력을 받기 위한 BufferedReader 설정
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        // 1. 첫 번째 줄 (점수)을 읽습니다. (계산에 필요하지 않음)
        br.readLine(); 
        
        // 2. 두 번째 줄 (야드 라인 n)을 읽고 정수로 변환합니다.
        int n = Integer.parseInt(br.readLine());
        
        // 3. 세 번째 줄 (온도)을 읽습니다. (계산에 필요하지 않음)
        br.readLine();
        
        // 4. 총 거리를 계산합니다.
        // 가는 거리: 10 (펜스->엔드존) + 10 (엔드존) + n (n야드 라인)
        // 오는 거리: n (n야드 라인) + 10 (엔드존) + 10 (엔드존->펜스)
        // 총 거리 = (10 + 10 + n) + (n + 10 + 10) = 40 + 2 * n
        int totalDistance = 40 + (2 * n);
        
        // 5. 결과를 출력합니다.
        System.out.println(totalDistance);
        
        br.close();
    }
}