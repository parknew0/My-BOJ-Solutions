
import java.io.*;
import java.util.*;

public class Main {

    public static void main (String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        String line = sc.nextLine();
        String newLine = line.toUpperCase();

        Map<Character, Integer> map = new HashMap<>();
        for (int i = 0 ; i < newLine.length() ; i++) {
            char c = newLine.charAt(i);
            map.put(c, map.getOrDefault(c, 0) + 1);
        }

        List<Map.Entry<Character, Integer>> entry = new ArrayList<>(map.entrySet());
        entry.sort(Comparator.comparing(Map.Entry<Character, Integer>::getValue).reversed());

        int first = entry.get(0).getValue();
        int second = -1;

        if (entry.size() > 1) second = entry.get(1).getValue();

        char ans;
        if (entry.size() > 1 && first == second) ans = '?';
        else ans = entry.get(0).getKey();

        System.out.println(ans);
    }
}
