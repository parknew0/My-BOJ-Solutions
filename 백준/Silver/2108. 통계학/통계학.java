
import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        int sum = 0;
        int middle;
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        Map<Integer, Integer> map = new TreeMap<>();
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            int input = Integer.parseInt(br.readLine());
            sum += input;
            map.put(input, map.getOrDefault(input,0) + 1);
            list.add(input);

            if(max < input) max = input;
            if(min > input) min = input;
        }

        Collections.sort(list);
        middle = list.get(n/2);

        int avg = (int)Math.round ((double) sum / n);

        int maxValue = Collections.max((map.values()));
        List<Integer> maxKeys = new ArrayList<>();

        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            if (entry.getValue() == maxValue) {
                maxKeys.add(entry.getKey());
            }
        }
        Collections.sort(maxKeys);

        int frequency;
        if (maxKeys.size() == 1) frequency = maxKeys.get(0);
        else frequency = maxKeys.get(1);;

        System.out.println((int)avg);
        System.out.println(middle);
        System.out.println(frequency);
        System.out.println(max - min);
    }
}
