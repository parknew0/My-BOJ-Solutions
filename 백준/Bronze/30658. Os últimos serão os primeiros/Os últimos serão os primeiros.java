import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        while (true) {
            String input = br.readLine();
            if (input == null || input.equals("0")) {
                break;
            }

            int n = Integer.parseInt(input);
            int[] arr = new int[n];

            // 배열 입력
            for (int i = 0; i < n; i++) {
                arr[i] = Integer.parseInt(br.readLine());
            }

            // 역순 출력
            for (int i = n - 1; i >= 0; i--) {
                sb.append(arr[i]).append('\n');
            }
            
            // 각 테스트 케이스 끝에 0 출력
            sb.append("0\n");
        }
        
        System.out.print(sb);
    }
}