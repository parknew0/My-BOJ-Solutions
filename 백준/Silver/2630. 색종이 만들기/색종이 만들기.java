
import java.io.*;
import java.util.*;

public class Main {
    static int blueCount = 0;
    static int whiteCount = 0;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[][] matrix = new int[n][n];
        StringTokenizer st;
        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine(), " ");
            for (int j = 0; j < n; j++) {
                matrix[i][j] = Integer.parseInt(st.nextToken());
            }
        }
        coloredPaper(0, matrix[0].length,0, matrix[0].length, matrix);

        System.out.println(whiteCount);
        System.out.println(blueCount);
    }

    public static void coloredPaper(int xstart, int xend, int ystart, int yend, int[][] matrix)
    {
        if (xstart == xend - 1 && ystart == yend - 1) {
            if (matrix[xstart][ystart] == 0) {
                whiteCount++;
            }
            else {
                blueCount++;
            }
            return;
        }

        int firstNum = matrix[xstart][ystart];
        boolean isFilliped = false;
        for (int i = xstart; i < xend; i++) {
            for (int j = ystart; j < yend; j++) {
                if (matrix[i][j] != firstNum) {
                    isFilliped = true;
                    coloredPaper(xstart, (xstart + xend) / 2, ystart, (ystart + yend) / 2, matrix); // 1
                    coloredPaper(xstart, (xstart + xend) / 2, (ystart + yend) / 2, yend, matrix); // 2
                    coloredPaper((xstart + xend) / 2, xend, ystart, (ystart + yend) / 2, matrix); // 3
                    coloredPaper((xstart + xend) / 2, xend, (ystart + yend) / 2, yend, matrix); // 4
                    break;
                }
            }
            if (isFilliped) break;
        }

        if (!isFilliped && firstNum == 1) blueCount++;
        if (!isFilliped && firstNum == 0) whiteCount++;

        return;
    }
}
