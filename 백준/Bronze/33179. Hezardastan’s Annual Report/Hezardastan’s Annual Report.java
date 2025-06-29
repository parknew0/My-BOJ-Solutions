import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();  // 챕터 개수
        int totalPages = 0;    // 전체 페이지 수

        for (int i = 0; i < n; i++) {
            int pages = sc.nextInt();
            totalPages += pages;

            // 해당 챕터가 홀수 페이지면 빈 페이지 1장 추가
            if (pages % 2 == 1) {
                totalPages++;
            }
        }

        // 양면 인쇄하므로 2장씩 한 종이에 인쇄 → 올림 처리
        int totalSheets = (totalPages + 1) / 2;

        System.out.println(totalSheets);
    }
}
