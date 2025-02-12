
import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        String[] tokens = br.readLine().split(" ");
        Map<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < n; i++) {
            map.put(i + 1, Integer.parseInt(tokens[i]));
        }

        // 1. 맵의 엔트리들을 리스트로 변환하기
        List<Map.Entry<Integer, Integer>> entryList = new ArrayList<>(map.entrySet());
        entryList.sort(Comparator.comparingInt(Map.Entry::getValue));

        int sum = 0;
        int i = n;
        for (Map.Entry<Integer, Integer> entry : entryList) {
            sum += entry.getValue() * i;
            i--;
        }

        System.out.println(sum);
    }
}
