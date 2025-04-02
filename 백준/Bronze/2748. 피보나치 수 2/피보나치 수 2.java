
import java.io.*;
import java.util.*;
import java.math.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int n = Integer.parseInt(br.readLine());
        sb.append(fib(n));

        System.out.print(sb);
    }

    public static BigInteger fib (int n) {
        if (n <= 1) return BigInteger.valueOf(n);

        BigInteger a = BigInteger.ZERO, b = BigInteger.ONE;
        BigInteger temp = BigInteger.valueOf(-1);
        for (int i = 2 ; i <= n ; i++) {
            temp = a.add(b);
            a = b;
            b = temp;
        }
        return temp;
    }
}
