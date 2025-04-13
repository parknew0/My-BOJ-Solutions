
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        String input;
        while (!(input = br.readLine()).equals("#")) {
            int count = 0;
            for (int i = 0 ; i < input.length() ; i++) {
                char c = input.toLowerCase().charAt(i);
                if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') count++;
            }
            sb.append(count).append("\n");
        }

        System.out.print(sb);
    }
}
