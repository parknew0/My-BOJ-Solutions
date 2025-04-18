import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        Map<Integer,Integer> map = new HashMap<>();
        int count = 0;
        for (int i = 0 ; i < n ; i++) {
            String[] tokens = br.readLine().split(" ");
            int cow = Integer.parseInt(tokens[0]);
            int endPoint = Integer.parseInt(tokens[1]);

            if (!map.containsKey(cow)) {
                map.put(cow, endPoint);
            }
            else {
                int curPoint = map.get(cow);
                if (curPoint != endPoint) {
                    map.put(cow, endPoint);
                    count++;
                }
            }
        }

        System.out.print(count);
    }
}