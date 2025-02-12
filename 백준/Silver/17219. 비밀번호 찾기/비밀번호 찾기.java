
import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] tokens = br.readLine().split(" ");
        int n = Integer.parseInt(tokens[0]);
        int m = Integer.parseInt(tokens[1]);

        Map<String, String> memoMap = new HashMap<>();
        for (int i = 0; i < n; i++) {
            tokens = br.readLine().split(" ");
            memoMap.put(tokens[0], tokens[1]);
        }

        for (int i = 0; i < m; i++) {
            bw.write(memoMap.get(br.readLine()) + "\n");
        }
        bw.flush();
        bw.close();
    }
}
