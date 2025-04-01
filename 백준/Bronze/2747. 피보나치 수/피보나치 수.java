
import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int n = Integer.parseInt(br.readLine());
        sb.append(fib(n));

        System.out.print(sb);
    }

    public static int fib (int n) {
        if (n <= 1) return n;

        int a = 0, b = 1;
        int temp = -1;
        for (int i = 2 ; i <= n ; i++) {
            temp = a + b;
            a = b;
            b = temp;
        }
        return temp;
    }
}
