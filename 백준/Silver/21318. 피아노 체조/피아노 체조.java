
import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int n = Integer.parseInt(br.readLine());
        int[] arr = new int[n + 1];
        int[] prefix = new int[n + 1];
        String[] tokens = br.readLine().split(" ");
        for (int i = 0 ; i < n ; i++) {
            arr[i + 1] = Integer.parseInt(tokens[i]);
        }

        for (int i = 1 ; i < n ; i++) {
            if (arr[i] > arr[i + 1]) {
                prefix[i] = prefix[i - 1] + 1;
            }
            else {
                prefix[i] = prefix[i - 1];
            }
        }
        prefix[n] = prefix[n - 1];

        // q번 입력 받은 것들은, 입력받자마자 해결할 수 있도록 한다.
        int q = Integer.parseInt(br.readLine());
        for (int i = 0 ; i < q ; i++) {
            tokens = br.readLine().split(" ");
            int x = Integer.parseInt(tokens[0]);
            int y = Integer.parseInt(tokens[1]);

            int result = prefix[y - 1] - prefix[x - 1];
            sb.append(result).append("\n");
        }

        System.out.print(sb);
    }
}
