import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        String line;

        while ((line = br.readLine()) != null) {
            if (line.equals("END")) {
                break;
            }
            // StringBuilder의 reverse() 메소드를 사용하여 문자열을 뒤집습니다.
            sb.append(new StringBuilder(line).reverse().toString()).append("\n");
        }
        System.out.print(sb.toString());
        br.close();
    }
}