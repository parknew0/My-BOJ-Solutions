
import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int n = Integer.parseInt(br.readLine());
        if (n < 10) {
            n *= 10;
        }

        int count = 0;
        int target = n;
        do {
            int digitSum = target / 10 + target % 10;
            target = (target % 10) * 10 + digitSum % 10;

            count++;
        } while (n != target);
        
        System.out.print(count);

    }
}
