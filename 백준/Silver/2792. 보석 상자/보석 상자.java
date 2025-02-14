

import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        // 빠른 입력을 위한 BufferedReader 사용
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        long N = Long.parseLong(st.nextToken());  // 학생 수
        int M = Integer.parseInt(st.nextToken());   // 색상의 수

        long[] gems = new long[M];
        long maxGem = 0;  // 보석이 가장 많은 색깔의 개수
        for (int i = 0; i < M; i++) {
            gems[i] = Long.parseLong(br.readLine());
            maxGem = Math.max(maxGem, gems[i]);
        }

        // 이분 탐색: 가능한 최대 보석 개수(질투심) X를 1부터 maxGem 사이에서 결정
        long lo = 1, hi = maxGem, answer = hi;
        while (lo <= hi) {
            long mid = (lo + hi) / 2;

            // 현재 mid를 최대 보석 개수(질투심)로 했을 때 필요한 학생 수 계산
            long required = 0;
            for (int i = 0; i < M; i++) {
                // (gems[i] + mid - 1) / mid 는 ceil(gems[i] / mid)와 같습니다.
                required += (gems[i] + mid - 1) / mid;
                if (required > N) break;  // N명을 초과하면 더 계산할 필요 없음
            }

            // 필요한 학생 수가 N 이하이면, mid(질투심)을 더 줄일 수 있는지 확인
            if (required <= N) {
                answer = mid;
                hi = mid - 1;
            } else {
                lo = mid + 1;
            }
        }

        System.out.println(answer);
    }
}
