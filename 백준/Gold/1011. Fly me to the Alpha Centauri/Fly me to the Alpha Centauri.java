
import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        
        int T = Integer.parseInt(br.readLine());
        for (int t = 0; t < T; t++) {
            String[] tokens = br.readLine().split(" ");
            long x = Long.parseLong(tokens[0]);
            long y = Long.parseLong(tokens[1]);
            long goalDistance = y - x;
            
            // 만약 이동해야 할 거리가 0이면 0을 출력
            if (goalDistance == 0) {
                sb.append("0").append("\n");
                continue;
            }
            
            long movedDistance = 0; // 누적 이동거리
            int i = 0;             // 현재 이동 단계(한 사이클에서의 최고 이동 거리)
            int count = 0;         // 총 이동 횟수 (사이클마다 2씩 증가)
            
            while (true) {
                i++;                     // 이동 단계 증가
                movedDistance += i * 2;  // 가속과 감속으로 i씩 두 번 이동하므로 2*i를 더함
                count += 2;              // 한 사이클에 2번의 이동
                
                // 마지막 단계 없이도 목표 거리를 달성할 수 있다면, 이동 횟수를 하나 줄임
                if (movedDistance - i >= goalDistance) {
                    sb.append(count - 1).append("\n");
                    break;
                } 
                // 누적 이동거리가 목표 거리를 넘었다면, 현재 count가 정답
                else if (movedDistance >= goalDistance) {
                    sb.append(count).append("\n");
                    break;
                }
            }
        }
        System.out.print(sb);
    }
}
