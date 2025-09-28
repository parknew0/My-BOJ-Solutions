import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        // N이 1일 경우 예외 처리
        if (N == 1) {
            System.out.println("*");
            return;
        }

        // 두 줄로 된 패턴을 N번 반복
        for (int i = 0; i < N; i++) {
            // 첫 번째 줄 (홀수 자리 별)
            for (int j = 0; j < N; j++) {
                if (j % 2 == 0) { // 0부터 시작하므로 짝수 인덱스가 홀수 자리
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();

            // 두 번째 줄 (짝수 자리 별)
            for (int j = 0; j < N; j++) {
                if (j % 2 != 0) { // 홀수 인덱스가 짝수 자리
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}