import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        int[] arr = new int[n];

        StringTokenizer st = new StringTokenizer(br.readLine());
        int sum = 0;
        for (int i = 0 ; i < n ; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
            sum += arr[i];
        }
        Arrays.sort(arr);
        int budget = Integer.parseInt(br.readLine());
        if (sum <= budget) {
            System.out.print(arr[n - 1]);
            return;
        }

        int lo = 0, hi = arr[n - 1];
        int result = -1;
        while (lo <= hi) {
            int mi = (lo + hi) / 2;

            sum = 0;
            for (int i = 0 ; i < n ; i++){
                if (arr[i] <= mi) {
                    sum += arr[i];
                }
                else {
                    sum += mi;
                }
            }

            if (sum == budget) {
                result = mi;
                break;
            }
            else if (sum > budget) {
                hi = mi - 1;
            }
            else {
                result = mi;
                lo = mi + 1;
            }
            
        }

        System.out.print(result);

    }

}