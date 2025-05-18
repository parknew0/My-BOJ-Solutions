import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        // 첫 번째 줄에서 문자열의 길이 N을 읽지만 실제로는 사용하지 않음
        int n = Integer.parseInt(br.readLine());
        
        // 두 번째 줄에서 문자열 S를 읽음
        String s = br.readLine();
        
        // 마지막 5글자 추출
        String result = s.substring(s.length() - 5);
        
        // 출력
        System.out.println(result);
    }
}
