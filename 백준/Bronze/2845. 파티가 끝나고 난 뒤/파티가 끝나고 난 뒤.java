import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 1m2당 사람의 수 L과 파티가 열렸던 곳의 넓이 P를 입력받습니다.
        int L = sc.nextInt();
        int P = sc.nextInt();

        // 실제 참가자 수를 계산합니다.
        int totalPeople = L * P;

        // 결과를 저장할 StringBuilder를 생성합니다.
        StringBuilder sb = new StringBuilder();

        // 5개의 신문 기사에 실린 참가자 수와 실제 참가자 수의 차이를 계산합니다.
        for (int i = 0; i < 5; i++) {
            int articleCount = sc.nextInt();
            sb.append(articleCount - totalPeople);
            if (i < 4) {
                sb.append(" "); // 마지막 숫자가 아니면 공백을 추가합니다.
            }
        }

        // 최종 결과를 출력합니다.
        System.out.println(sb.toString());

        sc.close();
    }
}