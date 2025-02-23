
import java.io.*;
import java.util.*;

public class Main {
    // 오른쪽, 아랫쪽, 왼쪽, 위쪽
    static int[] dx = {0, -1, 0, 1};
    static int[] dy = {1, 0, -1, 0};

    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(br.readLine());
        char[][] matrix = new char[n][n];
        for (int i = 0; i < n; i++) {
            matrix[i] = br.readLine().toCharArray();
        }
        int[][] visited = new int[n][n];
        Map<Integer, Integer> map = new HashMap<>();
        int complexNum = 1;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (visited[i][j] == 0 && matrix[i][j] == '1') {
                    map.put(complexNum, 0);
                    bfs(matrix, visited, n, i, j, map, complexNum);
                    complexNum++;
                }
            }
        }
        bw.write(map.size() + "\n");
        List<Integer> valueList = new ArrayList<>(map.values());
        valueList.sort(Comparator.comparing(k -> k));
        
        for (int i : valueList) {
            bw.write(i + "\n");
        }
        bw.flush();
        bw.close();
    }

    public static void bfs(char[][] matrix, int[][] visited, int size, int x, int y, Map<Integer, Integer> map, int complexNum)
    {
        Deque<int[]> queue = new ArrayDeque<>();
        queue.offer(new int[]{x,y});
        visited[x][y] = complexNum;
        map.put(complexNum, map.get(complexNum) + 1);

        while (!queue.isEmpty()) {
            int[] cur = queue.poll();
            int currX = cur[0];
            int currY = cur[1];

            for (int i = 0; i < 4; i++) {
                int nx = currX + dx[i];
                int ny = currY + dy[i];
                if (0 <= nx && nx < size && 0 <= ny && ny < size && visited[nx][ny] == 0 && matrix[nx][ny] == '1') {
                    queue.offer(new int[] {nx, ny});
                    visited[nx][ny] = complexNum;
                    map.put(complexNum, map.get(complexNum) + 1);
                }
            }
        }
    }
}
