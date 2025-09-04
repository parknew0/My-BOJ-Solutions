import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int minBurgerPrice = 2001;
        for (int i = 0; i < 3; i++) {
            int price = sc.nextInt();
            if (price < minBurgerPrice) {
                minBurgerPrice = price;
            }
        }

        int minDrinkPrice = 2001;
        for (int i = 0; i < 2; i++) {
            int price = sc.nextInt();
            if (price < minDrinkPrice) {
                minDrinkPrice = price;
            }
        }

        int cheapestSetPrice = minBurgerPrice + minDrinkPrice - 50;
        System.out.println(cheapestSetPrice);

        sc.close();
    }
}