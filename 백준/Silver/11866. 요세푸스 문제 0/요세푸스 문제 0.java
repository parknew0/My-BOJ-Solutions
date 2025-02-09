import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();

        LinkedList<Integer> list = new LinkedList<>();
        for (int i = 1; i <= n; i++) {
            list.add(i);
        }

        int[] results = new int[n];
        int index = 0;
        int pos = 0; // 시작 인덱스 0부터

        // 리스트가 빌 때까지 반복
        while (!list.isEmpty()) {
            // 현재 리스트 크기에 대해 pos 계산
            pos = (pos + k - 1) % list.size();
            results[index++] = list.remove(pos);
        }

        // 결과 출력
        StringBuilder sb = new StringBuilder();
        sb.append("<");
        for (int i = 0; i < n; i++) {
            sb.append(results[i]);
            if (i != n - 1) sb.append(", ");
        }
        sb.append(">");
        System.out.println(sb.toString());
    }
}
