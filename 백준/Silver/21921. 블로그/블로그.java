
import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] prefix = new int[n + 1];
        prefix[0] = 0;

        int x = sc.nextInt();
        for (int i = 1 ; i <= n ; i++) {
            int num = sc.nextInt();
            prefix[i] = prefix[i - 1] + num;
        }
        sc.close();

        int Max = prefix[x] - prefix[0];
        int maxCount = 0;
        int index = x;

        while (index <= n) {
            int window = prefix[index] - prefix[index - x];

            if (Max == window) maxCount++;

            if (Max < window) {
                Max = window;
                maxCount = 1;
            }

            // System.out.println(Max);

            index++;
        }

        if (Max == 0) {
            System.out.print("SAD");
        }
        else {
            System.out.println(Max);
            System.out.print(maxCount);
        }
    }

}
