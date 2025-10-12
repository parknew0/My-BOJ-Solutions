import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        // 수열의 길이 N을 입력받습니다.
        int N = Integer.parseInt(br.readLine());

        // 수열을 저장할 배열을 생성합니다.
        int[] sequence = new int[N];

        // N개의 숫자를 입력받아 배열에 저장합니다.
        for (int i = 0; i < N; i++) {
            sequence[i] = Integer.parseInt(br.readLine());
        }

        // 등차수열인지 등비수열인지 판별합니다.
        // 첫 세 항을 기준으로 확인합니다.
        if (sequence[1] - sequence[0] == sequence[2] - sequence[1]) {
            // 등차수열인 경우
            // 공차(common difference)를 계산합니다.
            int diff = sequence[1] - sequence[0];
            // 마지막 항에 공차를 더해 다음 원소를 구합니다.
            System.out.println(sequence[N - 1] + diff);
        } else {
            // 등비수열인 경우
            // 공비(common ratio)를 계산합니다.
            int ratio = sequence[1] / sequence[0];
            // 마지막 항에 공비를 곱해 다음 원소를 구합니다.
            System.out.println(sequence[N - 1] * ratio);
        }
    }
}