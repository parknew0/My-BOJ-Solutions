
import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int N = Integer.parseInt(br.readLine());
        String inputLine;

        for (int i = 0; i < N; i++) {
            Stack<Character>stack = new Stack<>();
            inputLine = br.readLine();
            boolean isValid = true;

            for (int j = 0; j < inputLine.length(); j++) {
                char c = inputLine.charAt(j);

                if ( c == '(') {
                    stack.push(c);
                }
                if ( c == ')' ) {
                    if ( !stack.isEmpty() && stack.peek() == '(' ) {
                        stack.pop();
                    }
                    else {
                        isValid = false;
                        break;
                    }
                }
            }

            if ( stack.isEmpty() && isValid) { bw.write("YES\n"); }
            else { bw.write("NO\n"); }
        }

        bw.flush();
        bw.close();
    }
}
