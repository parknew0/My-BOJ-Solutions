
import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[] arr = new int[n];
        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        int m = Integer.parseInt(br.readLine());
        int[] arr2 = new int[m];
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < m; i++) {
            arr2[i] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(arr);
        int[] original = arr2.clone();
        Arrays.sort(arr2);
        int arrIndex = 0;
        int arr2Index = 0;
        int[] res = new int[m];
        Arrays.fill(res, 0);

        Set<Integer> set = new HashSet<>();
        while ( arr2Index < m  && arrIndex < n ) {
            if (arr[arrIndex] == arr2[arr2Index]) {
                set.add(arr2[arr2Index]);
                arrIndex++;
                arr2Index++;
            }
            else if (arr[arrIndex] > arr2[arr2Index]) {
                arr2Index++;
            }
            else if (arr[arrIndex] < arr2[arr2Index]) {
                arrIndex++;
            }
        }

        BufferedWriter bw  = new BufferedWriter(new OutputStreamWriter(System.out));

        for (int i = 0 ; i < m ; i++) {
            if (set.contains(original[i])) res[i] = 1;
        }

        for (int r : res) {
            bw.write(r + "\n");
        }



        bw.flush();
        bw.close();
    }
}