import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();
        int holeCount = 0;

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            switch (c) {
                case 'A':
                case 'D':
                case 'O':
                case 'P':
                case 'Q':
                case 'R':
                case 'a':
                case 'b':
                case 'd':
                case 'e':
                case 'g':
                case 'o':
                case 'p':
                case 'q':
                case '@':
                    holeCount += 1;
                    break;
                case 'B':
                    holeCount += 2;
                    break;
                default:
                    // No holes for other characters
                    break;
            }
        }

        System.out.println(holeCount);
    }
}