import java.io.*;
import java.util.*;

public class Main {
    static int n, m, ans;
    static int[][] maze;
    // 각 좌표에 도달하는 최소 이동 횟수를 저장하는 배열
    static int[][] minSteps;
    // (아래, 오른쪽, 위, 왼쪽) 순서로 이동하여, 목표인 오른쪽 아래로 빠르게 접근하도록 함
    static int[] dr = {1, 0, -1, 0};
    static int[] dc = {0, 1, 0, -1};
    
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());
        maze = new int[n][m];
        minSteps = new int[n][m];
        
        // 미로와 최소 이동 횟수 배열 초기화
        for (int i = 0; i < n; i++) {
            String line = br.readLine();
            for (int j = 0; j < m; j++) {
                maze[i][j] = line.charAt(j) - '0';
                minSteps[i][j] = Integer.MAX_VALUE;
            }
        }
        ans = Integer.MAX_VALUE;
        // 시작 좌표 (0, 0)에서 시작하며, 시작칸도 포함하므로 초기 이동 횟수는 1
        dfs(0, 0, 1);
        System.out.println(ans);
    }
    
    static void dfs(int r, int c, int steps) {
        // 도착지에 도달하면, 최단 경로 갱신
        if (r == n - 1 && c == m - 1) {
            ans = Math.min(ans, steps);
            return;
        }
        
        // 현재 경로가 이미 기존의 최단 경로보다 길거나 같다면 탐색 중단
        if (steps >= ans) return;
        // 같은 좌표를 더 적은 이동 횟수로 방문한 적이 있으면 더 이상 진행할 필요 없음
        if (steps >= minSteps[r][c]) return;
        // 현재 좌표에 도달하는 최소 이동 횟수를 갱신
        minSteps[r][c] = steps;
        
        // 네 방향으로 이동
        for (int i = 0; i < 4; i++) {
            int nr = r + dr[i];
            int nc = c + dc[i];
            // 범위 내에 있고 이동 가능한 칸(1)인 경우에만 진행
            if (nr >= 0 && nr < n && nc >= 0 && nc < m && maze[nr][nc] == 1) {
                dfs(nr, nc, steps + 1);
            }
        }
    }
}
