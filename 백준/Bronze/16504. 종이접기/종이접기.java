import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        // 입력을 빠르게 처리하기 위해 BufferedReader를 사용합니다.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        // 첫 줄에서 N을 입력받습니다.
        int n = Integer.parseInt(br.readLine());

        // 합계를 저장할 변수를 선언합니다.
        // N의 최대값은 1024, 각 칸의 최대값은 100,000이므로
        // 총합은 int 범위를 넘어설 수 있습니다. 따라서 long 타입을 사용해야 합니다.
        long totalSum = 0;

        // N개의 줄을 반복하여 입력받습니다.
        for (int i = 0; i < n; i++) {
            // 한 줄을 통째로 읽어 StringTokenizer로 공백을 기준으로 나눕니다.
            StringTokenizer st = new StringTokenizer(br.readLine());

            // 한 줄에 있는 N개의 숫자를 반복하여 처리합니다.
            for (int j = 0; j < n; j++) {
                // 다음 숫자를 읽어와 long 타입으로 변환한 후, 총합에 더합니다.
                totalSum += Long.parseLong(st.nextToken());
            }
        }

        // 최종 합계를 출력합니다.
        System.out.println(totalSum);
    }
}