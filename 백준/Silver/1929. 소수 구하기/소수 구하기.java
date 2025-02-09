
import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException
    {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int n = sc.nextInt();

        List<Integer> list  = new ArrayList<>();

        for (int i = m; i <= n; i++) {
            if (i < 2) continue; // 0과 1은 소수가 아님
            if (i == 2) {
                list.add(2); // 2는 소수
                continue;
            }
            if (i % 2 == 0) {
                continue; // 짝수는 소수가 아님 (2 제외)
            }

            boolean isNotPrime = false;
            for (int j = 3; j * j <= i; j += 2) {
                if (i % j == 0) {
                    isNotPrime = true;
                    break;
                }
            }
            if (!isNotPrime) list.add(i);
        }

        for ( Integer i : list) {
            System.out.println(i);
        }
    }
}
