

import java.io.*;
import java.util.*;

public class Main {

    public static boolean isNumber (String s)
    {
        try { Integer.parseInt(s);
           return true;
        }
        catch(Exception e) { return false; }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = br.readLine();  // 한 번만 입력 받기

        // 숫자와 연산자 분리
        String[] numbers = input.split("[+-]");
        List<String> Operators = new ArrayList<>();

        // 연산자만 추출 (숫자 제거)
        for (char c : input.toCharArray()) {
            if (c == '+' || c == '-') {
                Operators.add(String.valueOf(c));
            }
        }
        
        int sum = 0;
        int temp;
        Deque <String> stack = new ArrayDeque<>();
        for (int i = 0; i < numbers.length ; i++) {
            stack.push(numbers[i]);
            if (i == Operators.size()) break;

            if (Operators.get(i).equals("-")) {
                temp = 0;
                while (!stack.isEmpty()) {
                    String s = stack.pop();
                    if (isNumber(s)) temp += Integer.parseInt(s);
                    else if (s.equals("-")) temp *= -1;
                }
                sum += temp;
                stack.push("-");
            }
        }

        temp = 0;
        while (!stack.isEmpty()) {
            String s = stack.pop();
            if (isNumber(s)) temp += Integer.parseInt(s);
            else if (s.equals("-")) temp *= -1;
        }
        sum += temp;

        System.out.println(sum);

    }
}
