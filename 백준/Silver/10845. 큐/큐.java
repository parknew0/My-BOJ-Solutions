
import java.io.*;
import java.util.*;

public class Main {

    public static class MyQueue {
        private LinkedList<Integer> list = new LinkedList<>();
        private int size;

        public MyQueue() {
            this.size = 0;
        }

        public void push(int x)
        {
            list.add(x);
            size++;
        }

        public int pop() {
            if (size == 0) return -1;

            int num = list.getFirst();
            list.removeFirst();
            --size;
            return num;
        }

        public int size() {
            return size;
        }

        public int empty() {
            if (size == 0) return 1;
            else return 0;
        }

        public int front() {
            if (this.empty() == 1) return -1;
            return list.getFirst();
        }

        public int back() {
            if (this.empty() == 1) return -1;
            return list.getLast();
        }
    }
    public static void main(String[] args) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        MyQueue queue = new MyQueue();
        StringBuilder sb = new StringBuilder();
        String s;

        while (n-- > 0) {
            s = br.readLine();

            if (s.startsWith("push")) {
                int num = Integer.parseInt(s.split(" ")[1]);
                queue.push(num);
            }
            else if (s.startsWith("pop")) {
                sb.append(queue.pop()).append("\n");
            }
            else if (s.startsWith("size")) {
                sb.append(queue.size()).append("\n");
            }
            else if (s.startsWith("empty")) {
                sb.append(queue.empty()).append("\n");
            }
            else if (s.startsWith("front")) {
                sb.append(queue.front()).append("\n");
            }
            else if (s.startsWith("back")) {
                sb.append(queue.back()).append("\n");
            }
        }

        System.out.print(sb.toString());
    }

}
