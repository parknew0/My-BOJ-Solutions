
import java.io.*;
import java.util.*;

public class Main {
    public static void main (String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[] arr = new int[n];
        StringTokenizer st = new StringTokenizer(br.readLine());

        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        if (n == 1) {
            System.out.println(n);
            return;
        }

        int max = 2;
        int left = 0; int right = 1;
        Map<Integer, Integer> map = new HashMap<>(); // 종류, 개수
        map.put(arr[left], map.getOrDefault(arr[left], 0) + 1);
        map.put(arr[right], map.getOrDefault(arr[right], 0) + 1);
        while (right <= n - 2) {

            if (map.size() > 2) {
                map.put(arr[left], map.get(arr[left]) - 1);
                if (map.get(arr[left]) == 0) {
                    map.remove(arr[left]);
                }

                left++;
            }
            else {
                right++;
                map.put(arr[right], map.getOrDefault(arr[right], 0) + 1);
                if(map.size() <= 2) {
                    max = Math.max(max, right - left + 1);
                }
            }
        }

        System.out.println(max);
    }

}