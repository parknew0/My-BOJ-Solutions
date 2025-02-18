
import java.io.*;
import java.util.*;

public class Main {

    public static void main (String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        List<String> list = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            list.add(br.readLine());
        }

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < list.get(0).length(); i++) {
            char c = list.get(0).charAt(i);
            boolean flag = true;
            for (int j = 0; j < n; j++) {
                if (list.get(j).charAt(i) != c) {
                    flag = false;
                    break;
                }
            }
            if (flag) sb.append(c);
            else sb.append("?");
        }

        System.out.println(sb);
    }
}
