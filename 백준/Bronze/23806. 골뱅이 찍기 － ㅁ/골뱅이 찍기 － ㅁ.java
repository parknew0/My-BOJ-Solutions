import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();

        // 1. 위쪽 영역 (5*N 너비, N 높이)
        for (int i = 0; i < N; i++) {
            sb.append("@".repeat(N * 5)).append("\n");
        }

        // 2. 중간 영역 (양옆 N 두께, 중간 3*N 공백, 3*N 높이)
        for (int i = 0; i < N * 3; i++) {
            sb.append("@".repeat(N))
              .append(" ".repeat(N * 3))
              .append("@".repeat(N))
              .append("\n");
        }

        // 3. 아래쪽 영역 (5*N 너비, N 높이)
        for (int i = 0; i < N; i++) {
            sb.append("@".repeat(N * 5)).append("\n");
        }

        System.out.print(sb);
    }
}