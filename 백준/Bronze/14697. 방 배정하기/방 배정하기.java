import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int A = Integer.parseInt(st.nextToken());
        int B = Integer.parseInt(st.nextToken());
        int C = Integer.parseInt(st.nextToken());
        int N = Integer.parseInt(st.nextToken());

        int possible = 0;

        for (int i = 0; i * A <= N; i++) {
            for (int j = 0; j * B <= N; j++) {
                for (int k = 0; k * C <= N; k++) {
                    if (A * i + B * j + C * k == N) {
                        possible = 1;
                        break;
                    }
                }
                if (possible == 1) break;
            }
            if (possible == 1) break;
        }

        System.out.println(possible);
    }
}