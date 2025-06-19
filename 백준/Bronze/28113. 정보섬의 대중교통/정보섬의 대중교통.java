import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken()); // 걷는 시간 (조건상 N ≤ B)
        int A = Integer.parseInt(st.nextToken()); // 버스 도착까지 시간
        int B = Integer.parseInt(st.nextToken()); // 지하철 도착까지 시간

        if (A < B) {
            System.out.println("Bus");
        } else if (A > B) {
            System.out.println("Subway");
        } else {
            System.out.println("Anything");
        }
    }
}
