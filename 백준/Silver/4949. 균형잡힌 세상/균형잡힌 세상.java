
import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    List<String> list = new ArrayList<>();
    StringBuilder sb = new StringBuilder();
    String inputLine;

    while ((inputLine = br.readLine()) != null) {
        if (inputLine.equals(".")) break;
        sb.append(inputLine);

        if (sb.charAt(sb.length() - 1) == '.') {
            list.add(sb.toString());
            sb = new StringBuilder();
        }
    }

    for (String s : list) {
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '(') {
                stack.push(s.charAt(i));
            }
            if (s.charAt(i) == ')') {
                if (!stack.isEmpty()) {
                    if (stack.peek() == '(') stack.pop();
                    else {stack.push('ㅋ'); break;}
                }else {stack.push('ㅋ'); break;}
            }
            if (s.charAt(i) == '[') {
                stack.push(s.charAt(i));
            }
            if (s.charAt(i) == ']') {
                if (!stack.isEmpty()) {
                    if (stack.peek() == '[') stack.pop();
                    else {stack.push('ㅋ'); break;}
                }else {stack.push('ㅋ'); break;}
            }
        }

        if (stack.isEmpty()) {
            bw.write("yes" + "\n");
        }
        else{
            bw.write("no" + "\n");
        }
    }

    bw.flush();
    bw.close();

    }
}
