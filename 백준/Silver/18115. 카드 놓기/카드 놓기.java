
import java.io.*;
import java.util.*;

public class Main {
    public static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    public static StringBuilder sb = new StringBuilder();

    /*
    입력
    5
    2 3 3 2 1

    출력
    1 5 2 3 4

    인덱스 변화
    i j k
    0 1 4
    0 2 4
    0 2 3
    0 2 2
    0 0 0
     */

    public static void main(String[] args) throws IOException {
        int n = Integer.parseInt(br.readLine());
        int[] cards = new int[n];

        int i, j, k;
        i = 0;
        if (n > 1) j = 1; else j = 0;
        k = n - 1;

        int cardNum = n;
        String[] tokens = br.readLine().split(" ");
        for (int index = 0 ; index < n ; index++) {
            int tech = Integer.parseInt(tokens[index]);

            if (tech == 1) {
                // 제일 위 카드 내려놓기
                cards[i] = cardNum--;

                do {
                    if (i + 1 < n) i++;
                } while (i + 1 < n && cards[i] != 0);

                if (i + 1 < n) {
                    j = i + 1;
                }
                else j = i;

                while (j + 1 < n && cards[j] != 0) {
                    j++;
                }

            }
            else if (tech == 2) {
                // 위에서 두번째 카드 내려놓기
                cards[j] = cardNum--;

                do {
                    if (j + 1 < n) j++;
                } while (j + 1 < n && cards[j] != 0);
            }
            else if (tech == 3) {
                // 제일 밑 카드 내려놓기
                cards[k] = cardNum--;

                do {
                    if (k - 1 >= 0) k--;
                } while (k - 1 >= 0 && cards[k] != 0);
            }
        }

        for (int card : cards) {
            sb.append(card).append(" ");
        }

        System.out.print(sb);
    }

}