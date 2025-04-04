
import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        int[] arr = new int[n];
        int[] prefix = new int[n];
        String[] tokens = br.readLine().split(" ");
        prefix[0] = Integer.parseInt(tokens[0]);
        arr[0] = prefix[0];

        for (int i = 1 ; i < n ; i++) {
            arr[i] = Integer.parseInt(tokens[i]);
            prefix[i] = arr[i] + prefix[i - 1];
        }

        long sum = 0;
        for (int i = 0 ; i < n ; i++) {
            int a = arr[i];
            sum += ((long)a * (prefix[n - 1] - prefix[i]));
        }


        System.out.print(sum);
    }

}
