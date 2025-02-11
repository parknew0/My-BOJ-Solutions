
import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        Map<Integer, String> map = new HashMap<>();
        Map<String, Integer> map2 = new HashMap<>();

        for (int i = 1; i <= n; i++) {
            String s = br.readLine();
            map.put(i, s);
            map2.put(s, i);
        }

        StringBuilder sb = new StringBuilder();
        for (int i = 1; i <= m; i++) {
            String s = br.readLine();
            if (isInteger(s)) {
                sb.append(map.get(Integer.parseInt(s))).append("\n");
            }
            else {
                sb.append(map2.get(s)).append("\n");
            }
        }

        System.out.println(sb);
    }

    public static boolean isInteger(String s) {
        try {
            Integer.parseInt(s);
            return true;
        }
        catch (Exception e) {
            return false;
        }
    }
}
