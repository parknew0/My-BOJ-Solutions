import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
        // 입력을 빠르게 처리하기 위해 BufferedReader를 사용합니다.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        // 첫 번째 줄에서 기프티콘의 개수(N)를 읽어 정수로 변환합니다.
        int N = Integer.parseInt(br.readLine());

        // 사용할 기프티콘의 개수를 저장할 변수를 0으로 초기화합니다.
        int usableCount = 0;

        // N번 반복하여 각 기프티콘의 유효기간을 확인합니다.
        for (int i = 0; i < N; i++) {
            // "D-xx" 형식의 문자열을 한 줄씩 읽습니다.
            String input = br.readLine();

            // "D-" 다음의 숫자 부분만 잘라냅니다. (인덱스 2부터 끝까지)
            String daysString = input.substring(2);

            // 잘라낸 숫자 문자열을 정수로 변환합니다.
            int daysLeft = Integer.parseInt(daysString);

            // 남은 유효기간이 90일 이하인지 확인합니다.
            if (daysLeft <= 90) {
                // 조건에 맞으면 카운트를 1 증가시킵니다.
                usableCount++;
            }
        }

        // 최종적으로 계산된 사용할 기프티콘의 개수를 출력합니다.
        System.out.println(usableCount);
    }
}