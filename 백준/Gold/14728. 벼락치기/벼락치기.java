
import java.io.*;
import java.util.*;

public class Main {
    public static StringBuilder sb = new StringBuilder();
    public static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws IOException {
        String[] tokens = br.readLine().split(" ");
        int n = Integer.parseInt(tokens[0]);
        int t = Integer.parseInt(tokens[1]);

        int[] dp = new int[t + 1]; // n 까지 공부해서 얻을 수 있는 최대 점수

        for (int i = 0 ; i < n ; i++) {
            tokens = br.readLine().split(" ");
            int k = Integer.parseInt(tokens[0]);
            int s = Integer.parseInt(tokens[1]);

            for (int j = t ; j >= 0 ; j--) {
                if(j - k >= 0) dp[j] = Math.max(dp[j], dp[j - k] + s);
            }
        }
        
        System.out.print(dp[t]);

    }

}