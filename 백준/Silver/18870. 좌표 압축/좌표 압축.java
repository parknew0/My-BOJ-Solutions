
import java.io.*;
import java.util.*;

public class Main {

    public static void main (String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        Map<Integer, Integer> map = new HashMap<>();
        int[] arr = new int[n];

        int i = 0;
        while (st.hasMoreTokens()) {
            int value = Integer.parseInt(st.nextToken());
            map.put(i, value);
            i++;
        }
        List<Map.Entry<Integer, Integer>> mapList = new ArrayList<>(map.entrySet());
        mapList.sort(Comparator.comparing(Map.Entry::getValue));

        i = 0;
        int reventValue = mapList.get(0).getValue();

        for (Map.Entry<Integer, Integer> entry : mapList) {

            if (i != 0) {
                if (entry.getValue() == reventValue) i--;
            }

            arr[entry.getKey()] = i;
            i++;

            reventValue = entry.getValue();
        }

        for (int j = 0; j < n; j++) {
            bw.write(arr[j] + " ");
        }

        bw.flush();
        bw.close();
    }
}