import java.util.Scanner;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 수정된 입력 순서: n, m, k (대대 수)를 먼저 읽고 a, b, c (병사 수)를 읽음
        int n = sc.nextInt(); // 조프리의 대대 수
        int m = sc.nextInt(); // 롭의 대대 수
        int k = sc.nextInt(); // 스타니스의 대대 수
        
        int a = sc.nextInt(); // 조프리의 대대별 병사 수
        int b = sc.nextInt(); // 롭의 대대별 병사 수
        int c = sc.nextInt(); // 스타니스의 대대별 병사 수
        
        sc.close();

        // 각 왕의 총 병력 계산 (이 부분은 이전과 동일)
        int joffreyStrength = n * a;
        int robbStrength = m * b;
        int stannisStrength = k * c;

        // 가장 강한 군대의 병력 수 계산
        int maxStrength = Math.max(joffreyStrength, Math.max(robbStrength, stannisStrength));

        // 결과 출력을 위한 리스트 생성
        ArrayList<String> winners = new ArrayList<>();

        // 가장 강한 군대를 가진 왕의 이름을 리스트에 추가 (사전 순서로 확인)
        if (joffreyStrength == maxStrength) {
            winners.add("Joffrey");
        }
        if (robbStrength == maxStrength) {
            winners.add("Robb");
        }
        if (stannisStrength == maxStrength) {
            winners.add("Stannis");
        }

        // 결과를 공백으로 구분하여 출력
        System.out.println(String.join(" ", winners));
    }
}