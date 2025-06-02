import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 과자 이름
        String[] names = {"S", "N", "U"};

        // 가장 좋은 과자 찾기
        double maxRatio = -1.0;
        String bestSnack = "";

        for (int i = 0; i < 3; i++) {
            int price = sc.nextInt();
            int weight = sc.nextInt();

            int totalPrice = price * 10;
            int totalWeight = weight * 10;

            if (totalPrice >= 5000) {
                totalPrice -= 500;
            }

            double ratio = (double) totalWeight / totalPrice;

            if (ratio > maxRatio) {
                maxRatio = ratio;
                bestSnack = names[i];
            }
        }

        System.out.println(bestSnack);
    }
}
