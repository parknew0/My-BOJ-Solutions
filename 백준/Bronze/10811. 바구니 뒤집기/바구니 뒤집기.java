
import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        String[] tokens = br.readLine().split(" ");
        int n = Integer.parseInt(tokens[0]);
        int m = Integer.parseInt(tokens[1]);

        int[] arr = new int[n];
        for (int i = 0 ; i < n ; i++) {
            arr[i] = i+1;
        }

        for (int i = 0 ; i < m ; i++) {
            tokens = br.readLine().split(" ");
            int start = Integer.parseInt(tokens[0]) - 1;
            int end = Integer.parseInt(tokens[1]) - 1;

            while (start < end) {
                int temp = arr[start];
                arr[start] = arr[end];
                arr[end] = temp;

                start++;
                end--;
            }
        }

        for (int i : arr) {
            sb.append(i).append(" ");
        }
        System.out.print(sb);

    }
}
