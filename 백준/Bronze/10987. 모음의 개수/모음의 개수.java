import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        // 입력을 받기 위해 BufferedReader를 생성합니다.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        // 첫 번째 줄의 단어를 읽어옵니다.
        String word = br.readLine();
        
        // 모음의 개수를 저장할 변수를 0으로 초기화합니다.
        int vowelCount = 0;
        
        // 단어의 길이만큼 반복합니다.
        for (int i = 0; i < word.length(); i++) {
            // 단어의 각 문자를 하나씩 가져옵니다.
            char ch = word.charAt(i);
            
            // 현재 문자가 모음(a, e, i, o, u) 중 하나인지 확인합니다.
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                // 모음이면 카운트를 1 증가시킵니다.
                vowelCount++;
            }
        }
        
        // 최종 모음의 개수를 출력합니다.
        System.out.println(vowelCount);
    }
}