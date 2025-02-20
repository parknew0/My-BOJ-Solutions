
import java.io.*;
import java.util.*;

public class Main {

    public static void main (String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        Map<Character, Integer> names = new HashMap<>();

        for (int i = 0; i < n; i++) {
            String input = br.readLine();
            char c = input.charAt(0);
            names.put(c, names.getOrDefault(c, 0) + 1);
        }

        List<Map.Entry<Character, Integer>> entry = new ArrayList<>(names.entrySet());
        entry.sort(Map.Entry.comparingByKey());

        StringBuilder sb = new StringBuilder();
        for (Map.Entry<Character, Integer> e : entry) {
            if (e.getValue() >= 5) {
                sb.append(e.getKey());
            }
        }

        if (sb.length() > 0) {
            System.out.println(sb.toString());
        }
        else {
            System.out.println("PREDAJA");
        }

    }

}
