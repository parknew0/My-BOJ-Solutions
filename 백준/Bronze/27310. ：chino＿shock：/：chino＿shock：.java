import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        // 입력을 받기 위한 BufferedReader 생성
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        // 이모지 문자열을 한 줄 입력받음
        String emoji = br.readLine();
        
        // 이모지의 전체 길이를 계산
        int totalLength = emoji.length();
        
        // 언더바(_)의 개수를 세기 위한 변수 초기화
        int underscoreCount = 0;
        
        // 문자열을 순회하며 언더바의 개수를 셈
        for (int i = 0; i < totalLength; i++) {
            if (emoji.charAt(i) == '_') {
                underscoreCount++;
            }
        }
        
        // 콜론(:)의 개수는 항상 2개
        int colonCount = 2;
        
        // 문제에 주어진 공식에 따라 입력 난이도 계산
        // (전체 길이) + (콜론의 개수) + (언더바의 개수) * 5
        int difficulty = totalLength + colonCount + (underscoreCount * 5);
        
        // 계산된 난이도를 출력
        System.out.println(difficulty);
    }
}