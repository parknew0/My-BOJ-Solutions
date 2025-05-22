import java.util.*;
import java.io.*;

public class Main {
    public static int MAX = 30;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        int[][] C = new int[MAX][MAX];

        // nCk = n-1Ck-1 + n-1Ck, n < 30
        // nC0 = 1, nCn = 1, 0C0 = 1
        for (int i = 0 ; i < MAX ; i++) {
            C[i][0] = C[i][i] = 1;
            for (int j = 1; j < i ; j++) {
                C[i][j] = C[i-1][j-1] + C[i-1][j];
            }
        }

        StringBuilder sb = new StringBuilder();
        while (t-- > 0) {
            String[] tokens = br.readLine().split(" ");
            int k = Integer.parseInt(tokens[0]);
            int n = Integer.parseInt(tokens[1]);

            sb.append(C[n][k]).append("\n");
        }

        System.out.println(sb);
    }
}
