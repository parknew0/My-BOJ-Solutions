import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        // 입력을 받기 위한 BufferedReader 설정
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        // 각 기술의 난이도 A, B, C를 읽어옵니다.
        int A = Integer.parseInt(st.nextToken()); // 한손 코딩
        int B = Integer.parseInt(st.nextToken()); // 노룩 코딩
        int C = Integer.parseInt(st.nextToken()); // 폰코딩

        // 동아리의 수 N을 읽어옵니다.
        int N = Integer.parseInt(br.readLine());

        // 가장 높은 점수를 저장할 변수를 초기화합니다.
        int maxScore = 0;

        // N개의 동아리에 대해 반복합니다.
        for (int i = 0; i < N; i++) {
            // 현재 동아리의 총 점수를 저장할 변수
            int currentClubScore = 0;

            // 각 동아리는 3명의 팀원으로 구성됩니다.
            for (int j = 0; j < 3; j++) {
                // 팀원의 기술 사용 횟수 a, b, c를 읽어옵니다.
                st = new StringTokenizer(br.readLine());
                int a = Integer.parseInt(st.nextToken()); // 한손 코딩 횟수
                int b = Integer.parseInt(st.nextToken()); // 노룩 코딩 횟수
                int c = Integer.parseInt(st.nextToken()); // 폰코딩 횟수

                // 팀원의 개인 점수를 계산합니다: (난이도 * 횟수)의 합
                int memberScore = (a * A) + (b * B) + (c * C);
                
                // 팀원의 점수를 동아리 총 점수에 더합니다.
                currentClubScore += memberScore;
            }

            // 현재 동아리의 점수가 지금까지의 최고 점수보다 높으면 갱신합니다.
            if (currentClubScore > maxScore) {
                maxScore = currentClubScore;
            }
            // 또는 Math.max 함수를 사용할 수 있습니다.
            // maxScore = Math.max(maxScore, currentClubScore);
        }

        // 모든 동아리 중 가장 높은 점수를 출력합니다.
        System.out.println(maxScore);
    }
}