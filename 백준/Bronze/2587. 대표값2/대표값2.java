
import java.io.*;
import java.util.*;

public class Main {
    public static StringBuilder sb = new StringBuilder();
    public static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws IOException {
        int[] arr = new int[5];
        int sum = 0;
        for (int i = 0 ; i < 5 ; i++) {
            arr[i] = Integer.parseInt(br.readLine());
            sum += arr[i];
        }

        Arrays.sort(arr);

        sb.append(sum / 5).append("\n");
        sb.append(arr[2]);
        System.out.print(sb);

    }

}