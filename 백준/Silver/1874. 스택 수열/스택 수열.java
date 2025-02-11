
import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        Stack<Integer> stack = new Stack<>();
        StringBuilder sb = new StringBuilder();

        int volume = 1;
        for (int i = 0; i < n; i++){
            int input = Integer.parseInt(br.readLine());

            if (input >= volume){
                for (int j = volume; j <= input; j++){
                    stack.push(j);
                    sb.append("+\n");
                }
                stack.pop();
                volume = input + 1;

                sb.append("-\n");
            }
            else {
                if(!stack.isEmpty() && stack.peek() == input){
                    stack.pop();
                    sb.append("-\n");
                }
                else { //스택이 비어있거나, 하나 미리 뽑아본 값이 input과 다른 경우
                    sb = new StringBuilder();
                    sb.append("NO");
                    break;
                }
            }

        }
        System.out.println(sb);

    }
}
