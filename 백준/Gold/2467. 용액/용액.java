import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int n = Integer.parseInt(br.readLine());

        int[] arr = new int[n];
        String[] tokens = br.readLine().split(" ");
        for (int i = 0 ; i < n ; i++) {
            int num = Integer.parseInt(tokens[i]);
            arr[i] = num;
        }

        int i = 0, j = n - 1;
        int left = arr[i], right = arr[j];
        int difference = arr[i] + arr[j];

        while (i < j) {
            if (Math.abs(arr[i] + arr[j]) < Math.abs(difference)) {
                difference = arr[i] + arr[j];
                left = arr[i];
                right = arr[j];
            }
            if (difference == 0) break;

            if (Math.abs(arr[i]) < Math.abs(arr[j])) {
                j--;
            }
            else if (Math.abs(arr[i]) > Math.abs(arr[j])) {
                i++;
            }
        }

        sb.append(left).append(" ").append(right);
        System.out.print(sb);

    }
}