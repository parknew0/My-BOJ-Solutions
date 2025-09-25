import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Baekjoon Online Judge 5532번 - 방학 숙제
 */
public class Main {
    public static void main(String[] args) throws IOException {
        // 입력을 받기 위한 BufferedReader 설정
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        // 입력 값들을 변수에 저장
        int L = Integer.parseInt(br.readLine()); // 방학 총 일수
        int A = Integer.parseInt(br.readLine()); // 풀어야 할 국어 총 페이지
        int B = Integer.parseInt(br.readLine()); // 풀어야 할 수학 총 페이지
        int C = Integer.parseInt(br.readLine()); // 하루에 풀 수 있는 최대 국어 페이지
        int D = Integer.parseInt(br.readLine()); // 하루에 풀 수 있는 최대 수학 페이지

        // 국어 숙제를 완료하는 데 필요한 최소 일수 계산
        // (A / C)가 나누어 떨어지지 않으면 하루가 더 필요하므로 올림 계산을 수행
        int koreanDays = A / C;
        if (A % C != 0) {
            koreanDays++;
        }

        // 수학 숙제를 완료하는 데 필요한 최소 일수 계산
        // (B / D)가 나누어 떨어지지 않으면 하루가 더 필요하므로 올림 계산을 수행
        int mathDays = B / D;
        if (B % D != 0) {
            mathDays++;
        }
        
        // 두 과목 중 더 오래 걸리는 날짜가 숙제에 필요한 총 일수
        int requiredDays = Math.max(koreanDays, mathDays);

        // 놀 수 있는 최대 일수 = 방학 총 일수 - 숙제에 필요한 총 일수
        int playableDays = L - requiredDays;

        // 결과 출력
        System.out.println(playableDays);
    }
}