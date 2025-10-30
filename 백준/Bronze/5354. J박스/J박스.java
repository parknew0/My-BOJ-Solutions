import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int T = Integer.parseInt(br.readLine()); // 테스트 케이스의 개수

        for (int t = 0; t < T; t++) {
            // 테스트 케이스 사이에 빈 줄 출력
            if (t > 0) {
                bw.write("\n");
            }

            int n = Integer.parseInt(br.readLine()); // 박스의 크기

            // n x n 박스 그리기
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    // 첫 번째 행, 마지막 행, 첫 번째 열, 마지막 열인지 확인 (테두리)
                    if (i == 0 || i == n - 1 || j == 0 || j == n - 1) {
                        bw.write("#");
                    } else {
                        // 테두리가 아닌 내부는 'J' 출력
                        bw.write("J");
                    }
                }
                bw.write("\n"); // 각 행의 끝에서 줄바꿈
            }
        }

        bw.flush(); // 버퍼에 남아있는 내용을 모두 출력
        bw.close(); // BufferedWriter 닫기
        br.close();  // BufferedReader 닫기
    }
}
