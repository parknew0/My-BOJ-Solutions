
import java.io.*;
import java.util.*;

public class Main {

    public static void main (String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        List<String> list = new ArrayList<>();
        Set<String> set;

        for (int i = 0; i < n; i++) {
            list.add(br.readLine());
        }

        int k = 0;
        for (int i = list.get(0).length() - 1 ; i >= 0; i--) {
            k++;
            set = new HashSet<>();
            for (int j = 0; j < n; j++) {
                String originalLine = list.get(j);
                String newLine = originalLine.substring(i,list.get(0).length());

                if (!set.contains(newLine)) set.add(newLine);
                else break;
            }
            if (set.size() == n) break;
        }
        System.out.println(k);
    }
}
