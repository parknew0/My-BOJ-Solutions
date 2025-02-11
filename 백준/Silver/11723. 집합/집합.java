
import java.io.*;
import java.util.*;

public class Main {

    public static class MySet {
        private int n;
        private int[] arr;

        public MySet(){
            n = 21; // 1 ~ 20 까지의 인덱스만 사용할 것임
            arr = new int[n];
        }

        public void add (int x) {
            arr[x] = 1;
        }

        public void remove (int x) {
            arr[x] = 0;
        }

        public int check (int x) {
            if(arr[x] == 1) return 1;
            return 0;
        }

        public void toggle (int x) {
            if (arr[x] == 1) arr[x] = 0;
            else if(arr[x] == 0) arr[x] = 1;
        }

        public void all () {
            Arrays.fill(arr, 1);
        }

        public void empty() {
            for (int i = 0; i < n; i++) {
                arr[i] = 0;
            }
        }
    }
    public static void main(String[] args) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        MySet myset = new MySet();
        StringBuilder sb = new StringBuilder();
        int n = Integer.parseInt(br.readLine());

        for (int i = 0; i < n; i++) {
            String s = br.readLine();
            String operator = s.split(" ")[0];

            if (operator.startsWith("add")) {
                myset.add(Integer.parseInt(s.split(" ")[1]));
            }
            else if (operator.startsWith("remove")) {
                myset.remove(Integer.parseInt(s.split(" ")[1]));
            }
            else if (operator.startsWith("check")) {
                int r = myset.check(Integer.parseInt(s.split(" ")[1]));
                sb.append(r).append("\n");
            }
            else if (operator.startsWith("toggle")) {
                myset.toggle(Integer.parseInt(s.split(" ")[1]));
            }
            else if (operator.startsWith("all")) {
                myset.all();
            }
            else if (operator.startsWith("empty")) {
                myset.empty();
            }

        }
        System.out.println(sb);

    }
}
