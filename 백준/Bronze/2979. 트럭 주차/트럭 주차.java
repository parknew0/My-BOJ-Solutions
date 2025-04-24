import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int[] costs = new int[3];
        for (int i = 0 ; i < 3 ; i++) {
            costs[i] = Integer.parseInt(st.nextToken());
        }

        int[][] periods = new int[3][2];
        int max = Integer.MIN_VALUE;
        for (int i = 0 ; i < 3 ; i++) {
            st = new StringTokenizer(br.readLine());
            periods[i][0] = Integer.parseInt(st.nextToken());
            periods[i][1] = Integer.parseInt(st.nextToken());

            max = Math.max(max, periods[i][1]);
        }

        // 입력 끝

        int[] currentCars = new int[max + 1];
        for (int i = 0 ; i < 3 ; i++) {
            for (int j = periods[i][0] ; j < periods[i][1] ; j++) {
                currentCars[j]++;
            }
        }

        int result = 0;
        for (int i = 0 ; i < max ; i++) {
            if(currentCars[i] == 0) continue;

            int cost = costs[currentCars[i] - 1];
            // System.out.print(currentCars[i] + ",");
            // System.out.print("cost :" + cost + "\n");
            result += currentCars[i] * cost;
        }

        System.out.print(result);
    }
}