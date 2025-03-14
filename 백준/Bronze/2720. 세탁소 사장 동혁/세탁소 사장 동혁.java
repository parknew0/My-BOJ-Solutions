
import java.io.*;
import java.util.*;

public class Main {
    public static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        for (int i = 0 ; i < n ; i++) {
            int num = Integer.parseInt(br.readLine());
            solve(num);
        }

        System.out.print(sb);
    }

    public static void solve(int num) {
        int quotient = num / 25;
        int remainder = num % 25;
        sb.append(quotient).append(" ");
        num = remainder;

        quotient = num / 10;
        remainder = num % 10;
        sb.append(quotient).append(" ");
        num = remainder;

        quotient = num / 5;
        remainder = num % 5;
        sb.append(quotient).append(" ");
        sb.append(remainder).append("\n");
    }
}