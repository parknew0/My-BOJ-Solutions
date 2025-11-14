import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = br.readLine();
        
        int originalLength = input.length();
        String replacedString = input.replace("DKSH", "");
        int newLength = replacedString.length();
        
        // "DKSH"의 길이는 4
        // (원래 길이 - "DKSH"가 모두 제거된 길이) / 4 = "DKSH"의 개수
        int count = (originalLength - newLength) / 4;
        
        System.out.println(count);
    }
}