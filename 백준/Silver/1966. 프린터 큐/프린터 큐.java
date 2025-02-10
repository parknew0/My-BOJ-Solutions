
import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException
    {
        // 입력처리
        int[] paperNumbers;
        int[] targetIndex;
        int[][] papers;

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        paperNumbers = new int[n];
        targetIndex = new int[n];
        papers = new int[n][];

        for (int i = 0; i < n; i++) {
            String[] input = br.readLine().split(" ");
            paperNumbers[i] = Integer.parseInt(input[0]);
            targetIndex[i] = Integer.parseInt(input[1]);

            int[] arr = new int[paperNumbers[i]];
            input = br.readLine().split(" ");
            for (int j = 0; j < paperNumbers[i]; j++) {
                arr[j] = Integer.parseInt(input[j]);
            }
            papers[i] = arr;
        }
        //구현 처리

        int[] results = new int[n];
        for (int i = 0; i < n; i++) {
            Set<Integer>weightingSet = new HashSet<>();
            Queue<Integer>queue = new LinkedList<>();

            for (int j = 0; j < paperNumbers[i]; j++) {
                weightingSet.add(papers[i][j]);
                queue.add(papers[i][j]);
            }
            TreeSet<Integer> sortedSet = new TreeSet<>(Collections.reverseOrder());
            sortedSet.addAll(weightingSet); // TreeSet은 자동으로 정렬해줌

            int max = sortedSet.pollFirst();
            int ti = targetIndex[i];
            int count = 0;
            while ( !queue.isEmpty()) {
                if (queue.peek() < max) {
                   queue.add(queue.poll());
                   ti = (ti -1 + paperNumbers[i]) % paperNumbers[i];
                }
                else if (queue.peek() == max) {
                    queue.poll();
                    count++;

                    if (ti == 0) {
                        results[i] = count;
                        break;
                    }
                    ti--;
                    paperNumbers[i] = paperNumbers[i] - 1;
                    if(!queue.contains(max)){
                        max = sortedSet.pollFirst();
                    }
                }
            }

        }

        for (int i : results) {
            System.out.println(i);
        }

    }
}
