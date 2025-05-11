import java.io.*;
import java.util.*;

public class Main {
    public static void main (String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int s = Integer.parseInt(st.nextToken());
        int[] arr = new int[n];
        st = new StringTokenizer(br.readLine());

        int totalSum = 0;
        for (int i = 0 ; i < n ; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
            totalSum += arr[i];
        }

        if (totalSum < s) {
            System.out.println(0);
            return;
        }

        int l = 0, r = 0, count = 0, sum = 0;
        int lowestCount = Integer.MAX_VALUE;
        while (r < n) {
            //System.out.println(arr[r] + "입력");
            sum += arr[r];
            //System.out.println(sum + " sum");
            count++;
            //System.out.println(count + "추가");

            if (sum >= s) {
                //System.out.println("sum >= s 통과");
                lowestCount = Math.min(lowestCount, count);

                while (sum - arr[l] >= s) {
                    //System.out.println("sum - arr[l] >= s while문 진입");
                    count--;
                    //System.out.println(count + "감소");
                    lowestCount = Math.min(lowestCount, count);
                    sum = sum - arr[l];
                    //System.out.println(arr[l] + "이번에 빼는 수 " +sum + " 감소된 sum");
                    l++;
                }
            }

            r++;
        }
        System.out.println(lowestCount);

    }
}
