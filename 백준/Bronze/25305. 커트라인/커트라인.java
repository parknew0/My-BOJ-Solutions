
import java.io.*;
import java.util.*;

public class Main {
    public static StringBuilder sb = new StringBuilder();
    public static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws IOException {
        String[] tokens = br.readLine().split(" ");
        int n = Integer.parseInt(tokens[0]);
        int k = Integer.parseInt(tokens[1]);
        int[] arr = new int[n];

        tokens = br.readLine().split(" ");
        for (int i = 0 ; i < n ; i++) {
            arr[i] = Integer.parseInt(tokens[i]);
        }

        Arrays.sort(arr);

        sb.append(arr[n - k]);

        System.out.print(sb);
    }

}