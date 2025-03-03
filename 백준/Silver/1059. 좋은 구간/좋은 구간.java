
import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int l = Integer.parseInt(br.readLine());
        Integer[] arr = new Integer[l];
        String[] tokens = br.readLine().split(" ");
        for (int i = 0; i < l; i++) {
            arr[i] = Integer.parseInt(tokens[i]);
        }
        int n = Integer.parseInt(br.readLine());
        // 입력 끝

        TreeSet<Integer> set = new TreeSet<>(Arrays.asList(arr)); // Collections 만 소괄호안에 들어올수 있음

        Integer low = set.floor(n);
        Integer high = set.ceiling(n);

        if (low == null) {
            low = 0;
        }
        if (low == n || high == n) {
            System.out.println(0);
            return;
        }


        low += 1;
        high -= 1;

        //StringBuilder sb = new StringBuilder();
        int count = 0;
        for (int i = low ; i <= n ; i++) {
            for (int j = n ; j <= high ; j++) {
                if (i == j) continue;
                count += 1;
            }
        }

        System.out.print(count);
    }
}