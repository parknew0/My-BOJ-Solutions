import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] science = new int[4]; // 물리, 화학, 생물, 지구과학
        for (int i = 0; i < 4; i++) {
            science[i] = sc.nextInt();
        }

        int history = sc.nextInt(); // 역사
        int geography = sc.nextInt(); // 지리

        Arrays.sort(science);
        int scienceSum = science[1] + science[2] + science[3]; // 가장 큰 3개 선택
        int socialMax = Math.max(history, geography); // 역사, 지리 중 큰 점수 선택

        System.out.println(scienceSum + socialMax);
    }
}
