import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;

        // 테스트케이스의 개수 T
        int T = Integer.parseInt(br.readLine());

        while (T-- > 0) {
            st = new StringTokenizer(br.readLine());
            // 우주선의 개수 N, 목적지까지의 거리 D
            int N = Integer.parseInt(st.nextToken());
            // D를 double로 읽어 정수 나눗셈 문제를 피합니다.
            double D = Double.parseDouble(st.nextToken()); 

            int count = 0; // 목적지까지 갈 수 있는 우주선의 개수

            for (int i = 0; i < N; i++) {
                st = new StringTokenizer(br.readLine());
                // 최고속도 v, 연료양 f, 연료소비율 c
                double v = Double.parseDouble(st.nextToken());
                double f = Double.parseDouble(st.nextToken());
                double c = Double.parseDouble(st.nextToken());

                // 1. 목적지까지 가는 데 걸리는 시간 계산
                // 시간 = 거리 / 속도
                double time = D / v;

                // 2. 목적지까지 가는 데 필요한 총 연료 소비량 계산
                // 필요한 연료 = 시간 * 단위시간당 연료소비율
                double fuelNeeded = time * c;

                // 3. 현재 가진 연료(f)가 필요한 연료(fuelNeeded)보다 많거나 같은지 확인
                if (f >= fuelNeeded) {
                    count++;
                }
            }
            // 각 테스트케이스의 결과를 StringBuilder에 추가
            sb.append(count).append('\n');
        }

        // 모든 테스트케이스의 결과를 한 번에 출력
        System.out.print(sb);
    }
}