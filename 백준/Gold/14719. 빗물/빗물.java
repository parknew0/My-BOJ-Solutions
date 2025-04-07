
import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] tokens = br.readLine().split(" ");
        int h = Integer.parseInt(tokens[0]);
        int w = Integer.parseInt(tokens[1]);

        tokens = br.readLine().split(" ");
        int[] ground = new int[w];
        for (int i = 0 ; i < w ; i++) {
            ground[i] = Integer.parseInt(tokens[i]);
        }
        int sum = 0;
        while (h > 0) {
            int left = -1, right = -1;

            for (int i = 0 ; i < w ; i++) {
                if (ground[i] >= h && left == -1) {
                    left = i;
                }
                if (ground[i] >= h && right == -1) {
                    right = i;
                }
                if (left != -1 && right != -1) {
                    for (int j = left + 1 ; j < right ; j++) {
                        sum += (h - ground[j]);
                        ground[j] = h; // 이미 고인 물 계산이 끝났으면, 메워버린다.
                    }
                    left = right;
                    right = -1;
                }
            }

            h--;
        }

        System.out.print(sum);

    }

}
