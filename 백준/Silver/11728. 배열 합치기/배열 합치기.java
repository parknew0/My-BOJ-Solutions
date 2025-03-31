
import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        String[] tokens = br.readLine().split(" ");
        int n = Integer.parseInt(tokens[0]);
        int m = Integer.parseInt(tokens[1]);
        int[] nArr = new int[n];
        int[] mArr = new int[m];

        tokens = br.readLine().split(" ");
        for (int i = 0 ; i < n ; i++) {
            nArr[i] = Integer.parseInt(tokens[i]);
        }
        tokens = br.readLine().split(" ");
        for (int i = 0 ; i < m ; i++) {
            mArr[i] = Integer.parseInt(tokens[i]);
        }

        int[] combinedArr = new int[n + m];
        int i = 0, j = 0, k = 0;
        while (i < n && j < m) {
            if (nArr[i] < mArr[j]) {
                combinedArr[k++] = nArr[i++];
            }
            else {
                combinedArr[k++] = mArr[j++];
            }
        }

        if (i == n) {
            while (j < m) {
                combinedArr[k++] = mArr[j++];
            }
        }
        if (j == m) {
            while (i < n) {
                combinedArr[k++] = nArr[i++];
            }
        }

        for (i = 0; i < n + m ; i++) {
            sb.append(combinedArr[i]).append(" ");
        }

        System.out.print(sb);
    }
}
