
import java.io.*;
import java.util.*;

public class Main {
    public static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    public static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) throws IOException {
        int t = Integer.parseInt(br.readLine());

        while (t-- > 0){
            String functionLine = br.readLine();
            char[] functions = new char[functionLine.length()];
            for (int i = 0 ; i < functionLine.length() ; i++) {
                functions[i] = functionLine.charAt(i);
            }
            int n = Integer.parseInt(br.readLine());
            String inputNumbers = br.readLine();
            inputNumbers = inputNumbers.replace("[", "").replace("]", "");
            String[] tokens = inputNumbers.split(",");
            LinkedList<Integer> numbers = new LinkedList<>();
            for (int i = 0 ; i < n ; i++) {
                numbers.add(Integer.parseInt(tokens[i]));
            }
            // 각 테스트 케이스 별 입력 처리 완료
            boolean isErrored = false;
            boolean isReversed = false;
            for (int i = 0 ; i < functions.length ; i++) {
                if (functions[i] == 'R') {
                    isReversed = !isReversed;
                }
                else if (functions[i] == 'D'){
                    if (numbers.isEmpty()) {
                        isErrored = true;
                        break;
                    }

                    if (!isReversed) {
                        numbers.removeFirst();
                    }
                    else {
                        numbers.removeLast();
                    }
                }
            }

            if (isErrored) sb.append("error\n");
            else {
                sb.append("[");
                if (isReversed) {
                    // 뒤집힌 상태면 뒤에서부터 출력
                    Iterator<Integer> descIt = numbers.descendingIterator();
                    while (descIt.hasNext()) {
                        sb.append(descIt.next());
                        if (descIt.hasNext()) sb.append(",");
                    }
                } else {
                    // 그냥 순서대로 출력
                    Iterator<Integer> it = numbers.iterator();
                    while (it.hasNext()) {
                        sb.append(it.next());
                        if (it.hasNext()) sb.append(",");
                    }
                }
                sb.append("]\n");
            }
        }

        System.out.print(sb);
    }

}