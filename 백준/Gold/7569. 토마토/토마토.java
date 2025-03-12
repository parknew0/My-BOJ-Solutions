
import java.io.*;
import java.util.*;

public class Main {
    // 오른쪽, 아래, 3차원위, 왼쪽, 위, 3차원아래 순으로
    public static int[] dx = {0, 1, 0, 0, -1, 0}; // 위아래
    public static int[] dy = {1, 0, 0, -1, 0, 0}; // 양옆
    public static int[] dz = {0, 0, 1, 0, 0, -1}; // 3차원위아래
    public static int M;
    public static int N;
    public static int H;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        StringBuilder sb = new StringBuilder();

        M = Integer.parseInt(st.nextToken()); // cols
        N = Integer.parseInt(st.nextToken()); // rows
        H = Integer.parseInt(st.nextToken()); // heights
        int[][][] box = new int [H][N][M];
        Queue<int[]> queue = new LinkedList<>(); // 익은 토마토 위치를 저장할 큐

        // 입력 및 초기 익은 토마토 위치 저장
        for (int i = 0; i < H; i++) {
            for (int j = 0; j < N; j++) {
                st = new StringTokenizer(br.readLine());
                for (int k = 0; k < M; k++) {
                    box[i][j][k] = Integer.parseInt(st.nextToken());
                    if (box[i][j][k] == 1) {
                        queue.offer(new int[]{i, j, k, 0}); // 높이, 행, 열, 일수
                    }
                }
            }
        }

        int result = bfsOptimized(box, queue);

        // 안 익은 토마토가 있는지 확인
        for (int i = 0; i < H; i++) {
            for (int j = 0; j < N; j++) {
                for (int k = 0; k < M; k++) {
                    if (box[i][j][k] == 0) {
                        result = -1;
                        break;
                    }
                }
            }
        }

        sb.append(result);
        System.out.print(sb.toString());


    }

    public static int bfsOptimized(int[][][] box, Queue<int[]> queue) {
        int maxDays = 0;

        while (!queue.isEmpty()) {
            int[] current = queue.poll();
            int z = current[0];
            int x = current[1];
            int y = current[2];
            int days = current[3];

            maxDays = Math.max(maxDays, days);

            for (int i = 0; i < 6; i++) {
                int nz = z + dz[i];
                int nx = x + dx[i];
                int ny = y + dy[i];

                if (0 <= nz && nz < H && 0 <= nx && nx < N && 0 <= ny && ny < M && box[nz][nx][ny] == 0) {
                    box[nz][nx][ny] = 1;
                    queue.offer(new int[]{nz, nx, ny, days + 1});
                }
            }
        }

        return maxDays;
    }
}