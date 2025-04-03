

import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String a = br.readLine();
        String b = br.readLine();

        Queue<String> queue = new ArrayDeque<>();
        queue.offer(b);
        boolean isFound = false;
        while (!queue.isEmpty()) {
            String cur = queue.poll();
            // System.out.println(cur);

            if (cur.equals(a)) {
                isFound = true;
                break;
            }
            if (cur.length() <= a.length()) continue;

            if (cur.charAt(0) == 'B'){
                String temp = new StringBuilder(cur).reverse().toString();
                temp = temp.substring(0, cur.length() - 1);

                queue.offer(temp);
            }

            if (cur.charAt(cur.length() - 1) == 'A') {
                String temp = cur.substring(0, cur.length() - 1);
                queue.offer(temp);
            }

        }

        if (isFound) System.out.print("1");
        else System.out.print("0");
    }

}
