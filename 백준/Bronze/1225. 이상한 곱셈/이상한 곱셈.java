
import java.io.*;
import java.util.*;

public class Main {

    public static void main (String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] tokens = br.readLine().split(" ");

        String a = tokens[0];
        String b = tokens[1];

        long sum = 0;
        for (int i = 0; i < a.length(); i++) {
            long outer = a.charAt(i) - '0'; // 숫자 0의 아스키 값은 48
            for (int j = 0; j < b.length(); j++) {
                long inner = b.charAt(j) - '0';
                sum += outer * inner;
            }
        }

        System.out.println(sum);
    }
}
