import java.io.*;
import java.util.*;

public class Main {
    public static void main (String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] tokens = br.readLine().split(" ");
        int n = Integer.parseInt(tokens[0]);
        int k = Integer.parseInt(tokens[1]);

        int[] coins = new int[k + 1];
        Arrays.fill(coins, Integer.MAX_VALUE);
        Set<Integer> set = new TreeSet<>();

        for (int i = 0 ; i < n ; i++) {
            int input = Integer.parseInt(br.readLine());
            set.add(input);
        }

        Iterator<Integer> iter = set.iterator();
        while (iter.hasNext()) {
            int value = iter.next();
            for (int i = 1 ; i <= k ; i++) {
                int count = 1;
                if (value == i) {
                    while (value * count <= k) {
                        coins[value * count] = count;
                        count++;
                    }
                }
                else if (value < i) {
                    if (coins[i - value] != Integer.MAX_VALUE) {
                        coins[i] = Math.min(coins[i], coins[i - value] + 1);
                    }
                }
            }
        }

        // System.out.println(Arrays.toString(coins));
        System.out.println(coins[k] == Integer.MAX_VALUE ? -1 : coins[k]);
    }
}
