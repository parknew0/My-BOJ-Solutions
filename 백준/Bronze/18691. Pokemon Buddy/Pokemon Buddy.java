import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < T; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int G = Integer.parseInt(st.nextToken());
            int C = Integer.parseInt(st.nextToken());
            int E = Integer.parseInt(st.nextToken());

            int neededCandies = E - C;
            int totalKm = 0;

            if (neededCandies > 0) {
                int kmPerCandy;
                switch (G) {
                    case 1:
                        kmPerCandy = 1;
                        break;
                    case 2:
                        kmPerCandy = 3;
                        break;
                    case 3:
                        kmPerCandy = 5;
                        break;
                    default:
                        kmPerCandy = 0; // Should not happen based on constraints
                }
                totalKm = neededCandies * kmPerCandy;
            }
            sb.append(totalKm).append("\n");
        }
        System.out.print(sb.toString());
    }
}