import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 생년월일
        int y1 = sc.nextInt();
        int m1 = sc.nextInt();
        int d1 = sc.nextInt();

        // 기준 날짜
        int y2 = sc.nextInt();
        int m2 = sc.nextInt();
        int d2 = sc.nextInt();

        // 1. 만 나이
        int manAge = y2 - y1;
        // 생일이 안 지났으면 1살 뺌
        if (m2 < m1 || (m2 == m1 && d2 < d1)) {
            manAge--;
        }

        // 2. 세는 나이 (연도차 + 1)
        int countAge = (y2 - y1) + 1;

        // 3. 연 나이 (연도차)
        int yearAge = y2 - y1;

        System.out.println(manAge);
        System.out.println(countAge);
        System.out.println(yearAge);
        
        sc.close();
    }
}