import java.io.*;
import java.util.*;

public class Main {
    public static final int NUM_GEARS = 4;
    public static final int TEETH_PER_GEAR = 8;

    public static void main(String[] args) throws IOException
    {
        int[][] gearSet = new int[NUM_GEARS][TEETH_PER_GEAR];
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        for (int i = 0; i < NUM_GEARS; i++) {
            String line = br.readLine();
            for (int j = 0; j < TEETH_PER_GEAR; j++) {
                gearSet[i][j] = line.charAt(j) - '0';
            }
        }

        int k = Integer.parseInt(br.readLine());

        for (int i = 0; i < k; i++) {
            String[] tokens = br.readLine().split(" ");
            int gearIdx = Integer.parseInt(tokens[0]) - 1;
            int dir = Integer.parseInt(tokens[1]);

            ArrayDeque<int[]> queue = new ArrayDeque<>();
            boolean[] visited = new boolean[NUM_GEARS];
            queue.offer(new int[]{gearIdx, dir});
            visited[gearIdx] = true;

            while (!queue.isEmpty()) {
                int[] cur = queue.poll();
                int curGearIdx = cur[0];
                int curDir = cur[1];

                int prevGearIdx = -1;
                if (curGearIdx - 1 >= 0) prevGearIdx = curGearIdx - 1;
                int nextGearIdx = -1;
                if (curGearIdx + 1 < 4) nextGearIdx = curGearIdx + 1;


                if (prevGearIdx != -1 && !visited[prevGearIdx]) {
                    if (gearSet[curGearIdx][6] != gearSet[prevGearIdx][2]) {
                        queue.offer(new int[]{prevGearIdx, -1 * curDir});
                        visited[prevGearIdx] = true;
                    }
                }

                if (nextGearIdx != -1 && !visited[nextGearIdx]) {
                    if (gearSet[curGearIdx][2] != gearSet[nextGearIdx][6]) {
                        queue.offer(new int[]{nextGearIdx, -1 * curDir});
                        visited[nextGearIdx] = true;
                    }
                }

                curDir = (curDir + TEETH_PER_GEAR) % TEETH_PER_GEAR;

                // 1단계: 전체 배열 뒤집기
                reverse(gearSet[curGearIdx], 0, TEETH_PER_GEAR - 1);
                // 2단계: 앞쪽 k개 뒤집기
                reverse(gearSet[curGearIdx], 0, curDir - 1);
                // 3단계: 나머지 뒤집기
                reverse(gearSet[curGearIdx], curDir, TEETH_PER_GEAR - 1);

            }
        }

        int sum = 0;
        int r = 1;
        for (int i = 0; i < NUM_GEARS; i++) {
            sum += gearSet[i][0] * r;
            r *= 2;
        }

        System.out.println(sum);
    }

    public static void reverse(int[] arr, int start, int end)
    {
        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }
}
