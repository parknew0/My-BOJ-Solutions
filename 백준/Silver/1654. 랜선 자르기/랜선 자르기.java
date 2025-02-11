import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        // 입력 받기
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] line = br.readLine().split(" ");
        int k = Integer.parseInt(line[0]); // 가지고 있는 랜선의 개수
        int n = Integer.parseInt(line[1]); // 필요한 랜선의 개수
        int[] LANs = new int[k];
        long max = 0; // 최대 랜선 길이를 구하기 위해
        
        for (int i = 0; i < k; i++) {
            LANs[i] = Integer.parseInt(br.readLine());
            if (LANs[i] > max) {
                max = LANs[i];
            }
        }
        
        // 이분 탐색을 위한 변수 설정
        long low = 1;
        long high = max;
        long answer = 0;
        
        // 이분 탐색 시작
        while (low <= high) {
            long mid = (low + high) / 2;
            long count = 0;
            
            // 각 랜선으로부터 몇 개의 랜선을 만들 수 있는지 계산
            for (int i = 0; i < k; i++) {
                count += (LANs[i] / mid);
            }
            
            // 필요한 랜선 개수를 만들 수 있다면, 더 긴 길이도 가능한지 확인
            if (count >= n) {
                answer = mid;   // 현재 mid 길이가 후보
                low = mid + 1;  // 더 긴 길이 탐색
            } else {
                high = mid - 1; // mid 길이가 너무 길어서 N개를 만들 수 없으니, 줄여봄
            }
        }
        
        // 결과 출력
        System.out.println(answer);
    }
}
