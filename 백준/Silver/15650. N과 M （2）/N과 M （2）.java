
import java.io.*;
import java.util.*;

public class Main {
    public static int n;
    public static int m;
    public static int[] progressions;
    public static void main(String[] args) throws IOException
    {
        BufferedReader br = new BufferedReader( new InputStreamReader(System.in));
        StringTokenizer st= new StringTokenizer(br.readLine());
        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());
        progressions = new int[m];

        Comb(1,0);
    }

    public static void Comb(int start, int depth)
    {
        if (depth == m) {
            for (int i = 0; i < progressions.length; i++) {
                System.out.print(progressions[i] + " ");
            }
            System.out.println();
            return;
        }

        for (int i = start; i <= n; i++) {
            progressions[depth] = i;
            Comb(i + 1, depth + 1);
        }
    }

}
