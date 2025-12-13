import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int y = sc.nextInt();
        int c = sc.nextInt();
        int p = sc.nextInt();
        
        // Y 1개, C 2개, P 1개가 필요함
        // 따라서 y, c/2, p 중 최솟값이 정답
        System.out.println(Math.min(y, Math.min(c / 2, p)));
    }
}