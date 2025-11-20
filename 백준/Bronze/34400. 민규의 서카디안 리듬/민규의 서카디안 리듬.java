import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        // 테스트 케이스 개수 입력
        int T = Integer.parseInt(br.readLine());
        
        StringBuilder sb = new StringBuilder();
        
        for (int i = 0; i < T; i++) {
            int t = Integer.parseInt(br.readLine());
            
            // 전체 주기는 25시간 (17시간 깨어있음 + 8시간 잠)
            // t % 25 결과가 0 ~ 16이면 깨어있는 시간 (ONLINE)
            // 17 ~ 24이면 자는 시간 (OFFLINE)
            // 't시간 30분' 시점이므로, t=16일 때 16.5(ONLINE), t=17일 때 17.5(OFFLINE)으로 경계가 명확함
            if (t % 25 < 17) {
                sb.append("ONLINE\n");
            } else {
                sb.append("OFFLINE\n");
            }
        }
        
        System.out.print(sb);
    }
}