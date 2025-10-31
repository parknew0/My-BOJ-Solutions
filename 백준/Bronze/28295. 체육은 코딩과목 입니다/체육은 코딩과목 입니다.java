import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        // 0: 북(N), 1: 동(E), 2: 남(S), 3: 서(W)
        int currentDirection = 0;

        for (int i = 0; i < 10; i++) {
            int command = Integer.parseInt(br.readLine());

            switch (command) {
                case 1: // 우향우 (오른쪽 90도)
                    currentDirection = (currentDirection + 1) % 4;
                    break;
                case 2: // 뒤로 돌아 (오른쪽 180도)
                    currentDirection = (currentDirection + 2) % 4;
                    break;
                case 3: // 좌향좌 (왼쪽 90도, 즉 오른쪽 270도 또는 +3)
                    currentDirection = (currentDirection + 3) % 4;
                    break;
            }
        }

        // 0: N, 1: E, 2: S, 3: W
        char[] directions = {'N', 'E', 'S', 'W'};
        System.out.println(directions[currentDirection]);
    }
}