
import java.io.*;
import java.util.*;

public class Main {
    public static class Mystack {
        private int[] stack;
        private int size;

        public Mystack(int capacity) {
            stack = new int[capacity];
            size = 0;
        }

        public void push(int x)
        {
            stack[size] = x;
            size++;
        }

        public int pop() {
            if(size == 0) return -1;
            return stack[--size];
        }

        public int size() {
            return size;
        }

        public int empty() {
            if (size == 0) return 1;
            else return 0;
        }

        public int top() {
            if (this.empty() == 1) return -1;
            return stack[size - 1];
        }
    }
    public static void main(String[] args) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        Mystack mystack = new Mystack(n);
        StringBuilder sb  = new StringBuilder();
        String s;
        while (n-- > 0 ){
            s = br.readLine();

            if (s.startsWith("push")) {
                int number = Integer.parseInt(s.split(" ")[1]);
                mystack.push(number);
            }
            else if (s.startsWith("pop")) {
                sb.append(mystack.pop()).append("\n");
            }
            else if (s.startsWith("size")) {
                sb.append(mystack.size()).append("\n");
            }
            else if (s.startsWith("empty")) {
                sb.append(mystack.empty()).append("\n");
            }
            else if (s.startsWith("top")) {
                sb.append(mystack.top()).append("\n");
            }
        }

        System.out.print(sb);
    }

}
