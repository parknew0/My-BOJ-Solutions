
import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
     Scanner sc = new Scanner(System.in);
     int n = sc.nextInt();
     int[] dp = new int[n+1];

     for (int i = 1; i <= n; i++) {
         dp[i] = i; // 최악의 경우에 1^2로만 더하는걸로 가득 채워짐

         for (int j = 1; j * j <= i; j++) {
             dp[i] = Math.min(dp[i], dp[i - j * j] +1);
         }

     }

     System.out.println(dp[n]);
    }
}
