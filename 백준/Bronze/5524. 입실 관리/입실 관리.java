import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 첫 번째 줄에서 정수 N을 입력받습니다.
        int n = scanner.nextInt();
        scanner.nextLine(); // nextInt() 다음에 오는 줄바꿈 문자를 소비합니다.

        // N개의 문자열을 입력받아 각각 소문자로 변환하여 출력합니다.
        for (int i = 0; i < n; i++) {
            String s = scanner.nextLine();
            System.out.println(s.toLowerCase());
        }

        scanner.close();
    }
}
