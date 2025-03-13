
import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        char[][] arr = new char[5][];
        int maxCol = 0;
        for (int i = 0 ; i < 5 ; i++) {
            String input = br.readLine();
            int len = input.length();
            arr[i] = new char [len];

            for (int j = 0 ; j < len ; j++) {
                arr[i][j] = input.charAt(j);
            }
            maxCol = Math.max(maxCol, len);
        }

        for (int i = 0 ; i < maxCol ; i++) {
            for (int j = 0 ; j < 5 ; j++) {
                char c = getChar(arr, i, j);

                if (c != '!') {
                    sb.append(c);
                }
            }
        }

        System.out.print(sb);
    }

    public static char getChar (char[][] arr, int col, int row) {
        try {
            return arr[row][col];
        }
        catch (Exception e) {
            return '!';
        }
    }
}