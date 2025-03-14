
import java.io.*;
import java.util.*;

public class Main {
    public static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        int[] arr = new int[n];

        for (int i = 0 ; i < n ; i++) {
            arr[i] = Integer.parseInt(br.readLine());
        }
        Arrays.sort(arr);

        int k = n;
        int max = arr[0] * k;
        
        for (int i = 1 ; i < n ; i++) {
            k--;
            max = Math.max(max, arr[i] * k);
        }

        System.out.print(max);

    }

}