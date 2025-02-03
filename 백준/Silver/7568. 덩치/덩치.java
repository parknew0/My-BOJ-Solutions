
import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        List<int[]> list = new ArrayList<>();

        // 각 사람의 [몸무게, 키]를 list에 저장
        for (int i = 0; i < n; i++) {
            String[] tokens = br.readLine().split(" ");
            list.add(new int[]{Integer.parseInt(tokens[0]), Integer.parseInt(tokens[1])});
        }
        
        // 이전에 작성하신 정렬+스택 관련 디버그 출력 및 계산 부분은 제거합니다.
        
        // 문제에서 “자신보다 더 큰 덩치(몸무게와 키가 모두 큰 사람)의 수 + 1”을 등수로 정의하므로,
        // 모든 사람끼리 서로 비교하는 방식으로 등수를 구합니다.
        int[] result = new int[n];
        for (int i = 0; i < n; i++) {
            int count = 0;
            for (int j = 0; j < n; j++) {
                if (i == j) continue;
                // 만약 j번 사람이 i번 사람보다 몸무게와 키가 모두 크다면 count 증가
                if (list.get(j)[0] > list.get(i)[0] && list.get(j)[1] > list.get(i)[1]) {
                    count++;
                }
            }
            result[i] = count + 1;
        }
        
        // 결과를 공백으로 구분하여 한 줄에 출력
        StringBuilder sb = new StringBuilder();
        for (int r : result) {
            sb.append(r).append(" ");
        }
        System.out.println(sb.toString().trim());
    }
}
