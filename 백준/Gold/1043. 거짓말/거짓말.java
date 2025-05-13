import java.io.*;
import java.util.*;

public class Main {
    public static int[] parents;
    public static int root;

    public static void setup (int n) {
        parents = new int[n + 1];
        for (int i = 1 ; i <= n ; i++) {
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
        int first = find(a);
        int second = find(b);

        if (first == root) parents[second] = root;
        else if (second == root) parents[first] = root;
        else parents[second] = first;
    }

    public static void main (String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] tokens = br.readLine().split(" ");
        int n = Integer.parseInt(tokens[0]);
        int m = Integer.parseInt(tokens[1]);
        int[][] arr = new int[m][];

        setup(n);

        tokens = br.readLine().split(" ");
        if (Integer.parseInt(tokens[0]) == 0) {
            System.out.println(m);
            return;
        }
        else if (Integer.parseInt(tokens[0]) == 1) {
            root = Integer.parseInt(tokens[1]);
        }
        else {
            root = Integer.parseInt(tokens[1]);
            for (int i = 2 ; i <= Integer.parseInt(tokens[0]) ; i++) {
                parents[Integer.parseInt(tokens[i])] = root;
            }
        }

        for (int i = 0 ; i < m ; i++) {
            tokens = br.readLine().split(" ");
            int peopleNum = Integer.parseInt(tokens[0]);
            arr[i] = new int[peopleNum];

            for (int j = 0 ; j < peopleNum ; j++) {
                arr[i][j] = Integer.parseInt(tokens[j + 1]);
            }

            if (peopleNum > 1) {
                for (int j = 1 ; j < peopleNum ; j++) {
                    union(arr[i][j - 1], arr[i][j]);
                }
            }
        }

        int count = 0;
        for (int i = 0 ; i < m ; i++) {
            boolean flag = false;

            for (int j = 0 ; j < arr[i].length ; j++) {
                if (find(arr[i][j]) == root) {
                    flag = true;
                    break;
                }
            }
            if (!flag) count++;
        }

        System.out.println(count);

    }

}
