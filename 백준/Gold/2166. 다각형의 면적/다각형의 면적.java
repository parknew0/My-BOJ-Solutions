import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb  = new StringBuilder();

        int n = Integer.parseInt(br.readLine());
        int[] x = new int[n];
        int[] y = new int[n];
        for (int i = 0 ; i < n ; i++) {
            String[] tokens = br.readLine().split(" ");
            x[i] = Integer.parseInt(tokens[0]);
            y[i] = Integer.parseInt(tokens[1]);
        }

        long sum1 = 0;
        long sum2 = 0;
        for (int i = 0 ; i < n ; i++) {
            int j = (i + 1) % n;
            sum1 += (long) x[i] * y[j];
            sum2 += (long) x[j] * y[i];
        }

        double result = (double) Math.abs(sum1 - sum2) / 2;
        System.out.printf("%.1f", result);
    }
}
