
import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        TreeMap<Integer, Integer> treeMap = new TreeMap<>(); // 각 숫자와 그 숫자로 끝나는 LIS 길이를 저장
        StringTokenizer st = new StringTokenizer(br.readLine());
        
        int maxLength = 0; // 전체 LIS 길이를 추적하는 변수

        for (int i = 0; i < n; i++) {
            int input = Integer.parseInt(st.nextToken());
            int curLength = 1; // 기본 LIS 길이는 1 (원소 자기 자신만 포함)
            
            // 현재 숫자보다 작은 가장 큰 키(숫자) 찾기
            Integer lowButHighestKey = treeMap.lowerKey(input);
            
            // 현재 숫자보다 작은 숫자가 있다면
            if (lowButHighestKey != null) {
                int lowButHighestValue = treeMap.get(lowButHighestKey);
                curLength = lowButHighestValue + 1; // 현재 숫자의 LIS 길이 업데이트
            }
            
            // TreeMap 업데이트: 이미 있는 키의 경우 더 큰 길이로 업데이트
            Integer existingLength = treeMap.get(input);
            if (existingLength == null || curLength > existingLength) {
                treeMap.put(input, curLength);
            }
            
            // 큰 숫자가 작은 길이를 가진 경우, 이후 계산에 영향을 주지 않도록 최적화
            // 현재 숫자보다 큰 키들 중 value가 curLength보다 작거나 같은 키들 제거
            while (true) {
                Integer higherKey = treeMap.higherKey(input);
                if (higherKey == null) break;
                
                int higherValue = treeMap.get(higherKey);
                if (higherValue <= curLength) {
                    treeMap.remove(higherKey);
                } else {
                    break;
                }
            }
            
            // 최대 LIS 길이 업데이트
            maxLength = Math.max(maxLength, curLength);
        }

        // 최종 LIS 길이 출력
        System.out.println(maxLength);
    }
}