
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException{
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int n = Integer.parseInt(br.readLine());
    int m = Integer.parseInt(br.readLine());
    String s = br.readLine();

    int count = 0;
    int sum = 0;
    int prevChar = s.charAt(0);
    if (prevChar == 'I') {
        count = 1;
    }

    for (int i = 1; i < m; i++) {
        char c = s.charAt(i);
        if (c != prevChar && c == 'I') {
            count++;
            if (i == m - 1) {
                int oCount = (count > 1) ? count - 1 : 0;
                int temp = (oCount - n + 1) >= 0 ? oCount - n + 1 : 0;
                sum += temp;
            }
        }
        if (c != prevChar && c == 'O') {
            if (i == m - 1) {
                int oCount = (count > 1) ? count - 1 : 0;
                int temp = (oCount - n + 1) >= 0 ? oCount - n + 1 : 0;
                sum += temp;
            }
        }
        if (c == prevChar && c == 'I') {
            int oCount = (count > 1) ? count - 1 : 0;
            int temp = (oCount - n + 1) >= 0 ? oCount - n + 1 : 0;
            sum += temp;
            count = 1;
        }
        if (c == prevChar && c == 'O') {
            int oCount = (count > 1) ? count - 1 : 0;
            int temp = (oCount - n + 1) >= 0 ? oCount - n + 1 : 0;
            sum += temp;
            count = 0;
        }
        prevChar = c;
    }

    System.out.println(sum);
    }
}
