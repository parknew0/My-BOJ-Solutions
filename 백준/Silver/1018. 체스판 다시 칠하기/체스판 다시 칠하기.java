
import java.io.*;
import java.util.*;

public class Main {
    static int n;
    static int m;
    static char[][] arr;

    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] input = br.readLine().split(" ");
        n = Integer.parseInt(input[0]);
        m = Integer.parseInt(input[1]);
        arr = new char[n][m];

        String line;
        for(int i = 0; i < n; i++){
            line = br.readLine();
            for(int j = 0; j < m; j++){
                arr[i][j] = line.charAt(j);
            }
        }

        int result = Integer.MAX_VALUE;
        for (int i = 0; i < n - 7; i++) {
            for (int j = 0; j < m - 7; j++) {
                result = Math.min(result, wrongTileCheck(i, j));
            }
        }

        System.out.println(result);
    }

    public static int wrongTileCheck(int row, int col)
    {
        int whiteStartwrongTileCount = 0;
        int blackStartwrongTileCount = 0;

        for (int i = 0; i < 8; i++) {
            int whiteStart = i;
            for (int j = 0; j < 8; j++) {
                if (whiteStart % 2 == 0 && arr[row + i][col + j] != 'W') { // 2로 나누어 떨어졌다는 것은 하얀색타일부터 시작할 것이라는 것
                    whiteStartwrongTileCount++;
                }
                else if (whiteStart % 2 == 1 && arr[row + i][col + j] != 'B') {
                    whiteStartwrongTileCount++;
                }
                else if (!(whiteStart % 2 == 1) && arr[row + i][col + j] != 'B') {
                    blackStartwrongTileCount++;
                }
                else if (!(whiteStart % 2 == 0) && arr[row + i][col + j] != 'W') {
                    blackStartwrongTileCount++;
                }
                whiteStart += 1;
            }
        }

        return Math.min(whiteStartwrongTileCount, blackStartwrongTileCount);
    }
}