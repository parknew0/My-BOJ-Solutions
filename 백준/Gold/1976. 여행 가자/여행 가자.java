import java.io.*;
import java.util.*;

public class Main {
    public static int[] parents;

    public static void setup(int size) {
        parents = new int[size + 1];
        for (int i = 1 ; i <= size ; i++) {
            parents[i] = i;
        }
    }

    public static int find (int x) {
        if (parents[x] == x) {
            return x;
        }

        return parents[x] = find(parents[x]);
    }

    public static void union (int a, int b) {
        int A = find(a);
        int B = find(b);

        parents[B] = A;
    }

    public static void main (String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        int m = Integer.parseInt(br.readLine());

        setup(n);

        for (int i = 0 ; i < n ; i++) {
            String[] tokens = br.readLine().split(" ");
            for (int j = 0 ; j < tokens.length ; j++) {
                if (tokens[j].equals("1")) {
                    union(i + 1, j + 1);
                }
            }
        }

        String[] tokens = br.readLine().split(" ");
        int firstIndexResult = find(Integer.parseInt(tokens[0]));
        boolean flag = true;
        for (int i = 1 ; i < m ; i++) {
            if (firstIndexResult != find(Integer.parseInt(tokens[i]))){
                flag = false;
                break;
            }
        }

        if (flag) System.out.println("YES");
        else System.out.println("NO");
    }
}
