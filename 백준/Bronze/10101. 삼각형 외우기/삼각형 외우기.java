
import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int[] arr = new int[3];
        int sum = 0;
        int sixtyCount = 0;
        Set<Integer> set = new HashSet<>();
        for (int i = 0 ; i < 3 ; i++) {
            arr[i] = Integer.parseInt(br.readLine());
            sum += arr[i];

            set.add(arr[i]);

            if (arr[i] == 60) sixtyCount++;
        }

        if (sixtyCount == 3) sb.append("Equilateral");
        else if (sum == 180 && set.size() == 2) sb.append("Isosceles");
        else if (sum == 180 && set.size() == 3) sb.append("Scalene");
        else if (sum != 180) sb.append("Error");
        
        System.out.print(sb);

    }
}
