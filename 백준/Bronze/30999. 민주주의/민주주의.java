import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        // 입력을 받기 위한 BufferedReader 설정
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        // 첫 번째 줄에서 N과 M을 읽어옴
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken()); // 문제 후보의 수
        int m = Integer.parseInt(st.nextToken()); // 출제위원의 수

        // 출제될 문제의 수를 저장할 변수
        int approvedProblems = 0;
        
        // 과반수 기준 (M은 홀수이므로 M/2 보다 크면 과반수)
        int majority = m / 2;

        // N개의 문제 후보에 대해 반복
        for (int i = 0; i < n; i++) {
            // 각 문제 후보에 대한 찬반 의견 문자열을 읽음
            String opinions = br.readLine();
            int score_count = 0; // 찬성표 수를 세는 변수

            // 문자열을 순회하며 찬성('O')표의 개수를 셈
            for (int j = 0; j < m; j++) {
                if (opinions.charAt(j) == 'O') {
                    score_count++;
                }
            }

            // 찬성표가 과반수를 넘었는지 확인
            if (score_count > majority) {
                approvedProblems++;
            }
        }

        // 최종 출제될 문제의 수를 출력
        System.out.println(approvedProblems);
    }
}