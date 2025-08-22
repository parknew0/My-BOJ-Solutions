import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int T = Integer.parseInt(st.nextToken());
        int X = Integer.parseInt(st.nextToken());

        int N = Integer.parseInt(br.readLine());

        boolean allCanAttend = true;

        for (int i = 0; i < N; i++) {
            int K = Integer.parseInt(br.readLine());
            st = new StringTokenizer(br.readLine());
            boolean canAttend = false;
            for (int j = 0; j < K; j++) {
                int A = Integer.parseInt(st.nextToken());
                if (A == X) {
                    canAttend = true;
                    break;
                }
            }
            if (!canAttend) {
                allCanAttend = false;
                break;
            }
        }

        if (allCanAttend) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}