import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        // N 입력 및 배열 초기화
        int n = Integer.parseInt(br.readLine());
        int[] arr = new int[n];
        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        // M 입력 및 배열 초기화
        int m = Integer.parseInt(br.readLine());
        int[] queries = new int[m];
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < m; i++) {
            queries[i] = Integer.parseInt(st.nextToken());
        }

        // arr 정렬
        Arrays.sort(arr);

        // 각 query에 대해 이분 탐색 수행
        for (int q : queries) {
            if (Arrays.binarySearch(arr, q) >= 0) {
                bw.write("1\n");
            } else {
                bw.write("0\n");
            }
        }

        // 출력 flush
        bw.flush();
        bw.close();
    }
}
