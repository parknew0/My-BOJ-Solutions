
import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        int left = 1, right = 1, sum = 0;
        int count = 0;
        for (int i = right ; i <= n ; i++) {
            sum += i;

            while (sum > n) {
                sum -= left;
                left++;
            }

            if (sum == n) count++;
        }

        System.out.print(count);
    }
}