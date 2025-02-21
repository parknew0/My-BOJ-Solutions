
import java.io.*;
import java.util.*;

public class Main {
    public static void main (String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        char[][] arr = new char[n][m];

        int rowStart = 0;
        int colStart = 0;
        for (int i = 0; i < n; i++) {
            String line = br.readLine();
            for (int j = 0; j < m; j++) {
                char c = line.charAt(j);
                arr[i][j] = c;
                if (c == 'I') {
                    rowStart = i;
                    colStart = j;
                }
            }
        }

        int[] dx = {-1,1,0,0};
        int[] dy = {0,0,-1,1};

        Deque<int[]> queue = new ArrayDeque<>();
        boolean[][] visited = new boolean[n][m];

        queue.add(new int[]{rowStart,colStart});
        visited[rowStart][colStart] = true;

        int count = 0;
        while (!queue.isEmpty()) {
            int[] curr = queue.poll();
            int row = curr[0];
            int col = curr[1];

            if(arr[row][col] == 'P') {
                count++;
            }

            for (int i = 0; i < 4; i++) {
                int newRow = row + dx[i];
                int newCol = col + dy[i];

                if (newRow >= 0 && newRow < n && newCol >= 0 && newCol < m
                        && !visited[newRow][newCol] && arr[newRow][newCol] != 'X') {
                    visited[newRow][newCol] = true;
                    queue.offer(new int[]{newRow,newCol});
                }

            }
        }
        if (count > 0) {System.out.println(count);}
        else System.out.println("TT");

    }
}