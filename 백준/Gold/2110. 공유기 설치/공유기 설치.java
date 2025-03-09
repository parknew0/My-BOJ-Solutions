import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int c = Integer.parseInt(st.nextToken());
        int[] arr = new int[n];
        for (int i = 0 ; i < n ; i++) {
            arr[i] = Integer.parseInt(br.readLine());
        }
        Arrays.sort(arr);

        int lo = 1; // 최소 거리는 1
        int hi = arr[n - 1] - arr[0]; // 최대 거리는 마지막 집 - 첫 집
        int result = -1;

        while (lo <= hi) {
            int mi = (lo + hi) / 2;
            int count = 1; // 첫번째 집은 항상 포함한다.
            int temp = arr[0];
            for (int i = 1 ; i < n ; i++) {
                if (temp + mi <= arr[i]) {
                    count++;
                    temp = arr[i];
                    //System.out.println(temp);
                }
            }

            if (count >= c) {
                result = mi; // 현재 거리가 가능하니 저장, 더 큰 거리도 탐색가능함
                lo = mi + 1;
            }
            else {
                hi = mi - 1;
            }

            //System.out.println("=---=");

        }

        bw.write(String.valueOf(result));
        bw.flush();
        bw.close();
    }

}