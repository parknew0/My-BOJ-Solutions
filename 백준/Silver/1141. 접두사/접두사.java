
import java.io.*;
import java.util.*;

public class Main {

    public static void main (String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        Set<String> set = new HashSet<>();

        for (int i = 0; i < n; i++) {
            set.add(br.readLine());
        }

        Set <String> toRemove = new HashSet<>();
        for (String s1 : set) {
            for (String s2 : set) {
                if (s2.startsWith(s1) && !s1.equals(s2)) {
                    toRemove.add(s1);
                }
            }
        }

        System.out.println(set.size() - toRemove.size());

    }

}
