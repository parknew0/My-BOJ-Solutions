
import java.io.*;
import java.util.*;

public class Main {
    public static int n;
    public static int m;
    public static int[] arr;
    public static void main(String[] args) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());
        arr = new int[m];

        solve(1,0);
    }

    public static void solve (int start, int depth) {
        if (depth == m) {
            for (int item : arr) {
                System.out.print(item + " ");
            }
            System.out.println();
            return;
        }

        for (int i = start ; i <= n ; i++) {
            arr[depth] = i;
            solve(i, depth + 1);
        }
    }
}
