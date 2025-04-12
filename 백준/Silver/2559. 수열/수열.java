

import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] tokens = br.readLine().split(" ");
        int n = Integer.parseInt(tokens[0]);
        int k = Integer.parseInt(tokens[1]);
        tokens = br.readLine().split(" ");
        int[] stackedTemperatures = new int [n + 1];
        stackedTemperatures[0] = 0;

        for (int i = 0 ; i < n ; i++) {
            int curTemp = Integer.parseInt(tokens[i]);
            stackedTemperatures[i + 1] = stackedTemperatures[i] + curTemp;
        }

        int max = Integer.MIN_VALUE;
        for (int i = k ; i <= n ; i++) {
            int curlen = stackedTemperatures[i] - stackedTemperatures[i - k];
            max = Math.max(max, curlen);
        }

        System.out.print(max);
    }
}
