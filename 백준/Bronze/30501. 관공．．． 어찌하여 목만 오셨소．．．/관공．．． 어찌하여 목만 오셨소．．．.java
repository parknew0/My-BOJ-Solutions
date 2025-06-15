import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = Integer.parseInt(sc.nextLine());  // 용의자 수 입력
        for (int i = 0; i < n; i++) {
            String name = sc.nextLine();         // 용의자 이름 입력
            if (name.contains("S")) {            // 이름에 'S'가 포함되면
                System.out.println(name);        // 출력하고
                break;                           // 반복문 종료
            }
        }
    }
}
