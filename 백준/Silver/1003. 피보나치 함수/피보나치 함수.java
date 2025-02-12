
import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        List<Integer[]> list = new ArrayList<>();
        list.add(new Integer[] {1,0});
        list.add(new Integer[] {0,1});

        int t = Integer.parseInt(br.readLine());

        int max = -1;
        int start = 2;
        for (int i = 0; i < t; i++) {
            int n = Integer.parseInt(br.readLine());

            if (n == 0 || n == 1 || (n <= max)) {
                bw.write(list.get(n)[0] + " " + list.get(n)[1] + "\n");
                continue;
            }

            for (int j = start; j <= n; j++) {
                int zeroSum = list.get(j-1)[0] + list.get(j-2)[0];
                int oneSum = list.get(j-1)[1] + list.get(j-2)[1];
                list.add(new Integer[] {zeroSum, oneSum});
                // System.out.print(list.get(j)[0] +" " + list.get(j)[0] + "\n");
            }
            bw.write(list.get(n)[0] + " " + list.get(n)[1] + "\n");

            start = n + 1;
            max = Math.max(n, max);

        }

        bw.flush();
        bw.close();
    }
}
