import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 10권의 총 가격을 입력받습니다.
        int total = sc.nextInt();

        // 9권의 책 가격을 저장할 변수를 선언합니다.
        int sumOfNineBooks = 0;

        // for문을 이용해 9권의 책 가격을 입력받아 더합니다.
        for (int i = 0; i < 9; i++) {
            int price = sc.nextInt();
            sumOfNineBooks += price;
        }

        // 10권의 총 가격에서 9권의 가격을 빼서 가격을 모르는 책의 가격을 구합니다.
        int unknownPrice = total - sumOfNineBooks;

        // 결과를 출력합니다.
        System.out.println(unknownPrice);

        sc.close();
    }
}