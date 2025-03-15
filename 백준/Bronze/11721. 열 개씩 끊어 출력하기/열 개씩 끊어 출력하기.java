
import java.io.*;
import java.util.*;

public class Main {
    public static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = br.readLine();
        char[] c = input.toCharArray();

        int count = 0;
        for (int i = 0 ; i < c.length ; i++) {
            count++;
            sb.append(c[i]);
            if (count == 10) {
                sb.append("\n");
                count = 0;
            }
        }
        
        System.out.print(sb);
    }

}