
import java.io.*;
import java.util.*;

public class Main {
    static public int n, m;
    static public int[] selected;
    static public List<Integer> setList;

    static public StringBuilder sb = new StringBuilder();


    public static void main(String[] args) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());
        selected = new int[m];
        Set<Integer> set = new HashSet<>();
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            set.add(Integer.parseInt(st.nextToken()));
        }

        setList = new ArrayList<>(set);
        setList.sort(Comparator.comparing(Integer::intValue, Comparator.naturalOrder()));

        solve(0);

        System.out.println(sb.toString());
    }

    public static void solve(int depth) {
        if (depth == m) {
            for (int i = 0; i < m; i++) {
                sb.append(selected[i] + " ");
            }
            sb.append("\n");
            return;
        }

        for (int i = 0; i < setList.size(); i++) {
            selected[depth] = setList.get(i);
            if (depth - 1 != -1 && selected[depth - 1] > selected[depth]) { continue; }
            solve(depth + 1);
        }
    }
}
