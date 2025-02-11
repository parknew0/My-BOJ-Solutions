
import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] line = br.readLine().split(" ");
        int k = Integer.parseInt(line[0]);
        int n = Integer.parseInt(line[1]);
        int[] LANs = new int[k];
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < k; i++) {
            LANs[i] = Integer.parseInt(br.readLine());
            if (max < LANs[i]) { max = LANs[i]; }

        }

        long low = 1;
        long middle = -1;
        long high = max;
        long answer = 0;

        while (low <= high) {
            long sum = 0;
            middle = (low + high) / 2;

            for (int i = 0; i < k; i++) {
                sum += (LANs[i] / middle);
            }

            if (sum >= n) {
                answer = middle;   // 현재 mid 길이가 후보

                low = middle + 1;
            }
            else{
                high = middle - 1;
            }
        }

        System.out.print(answer);

    }
}
