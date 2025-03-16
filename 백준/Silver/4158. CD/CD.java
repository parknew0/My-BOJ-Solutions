import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        
        while (true) {
            String[] tokens = br.readLine().split(" ");
            int n = Integer.parseInt(tokens[0]);
            int m = Integer.parseInt(tokens[1]);
            
            // 입력의 마지막인 "0 0"을 처리
            if (n == 0 && m == 0) {
                break;
            }
            
            int[] arr1 = new int[n];
            int[] arr2 = new int[m];
            
            // 상근이의 CD 번호 입력
            for (int i = 0; i < n; i++) {
                arr1[i] = Integer.parseInt(br.readLine());
            }
            
            // 선영이의 CD 번호 입력
            for (int i = 0; i < m; i++) {
                arr2[i] = Integer.parseInt(br.readLine());
            }
            
            // 두 배열을 비교하며 같은 CD 개수 카운트
            int i = 0, j = 0;
            int count = 0;
            
            while (i < n && j < m) {
                if (arr1[i] == arr2[j]) {
                    count++;
                    i++;
                    j++;
                } else if (arr1[i] < arr2[j]) {
                    i++;
                } else {
                    j++;
                }
            }
            
            // 각 테스트 케이스의 결과를 StringBuilder에 추가
            sb.append(count).append("\n");
        }
        
        // 최종 결과 출력
        System.out.print(sb);
    }
}