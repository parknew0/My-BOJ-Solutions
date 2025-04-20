import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();  // 후보 문자열 개수 입력
        sc.nextLine();  // 개행 문자 소비

        int count = 0;

        for (int i = 0; i < n; i++) {
            String name = sc.nextLine();  // 문자열 입력
            if (name.startsWith("C")) {   // 'C'로 시작하는지 확인
                count++;
            }
        }

        System.out.println(count);  // 결과 출력
    }
}
