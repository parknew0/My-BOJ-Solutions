import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int N = sc.nextInt();
        double totalQALY = 0.0;
        
        for (int i = 0; i < N; i++) {
            double q = sc.nextDouble();
            double y = sc.nextDouble();
            totalQALY += q * y;
        }
        
        System.out.printf("%.3f\n", totalQALY);
        
        sc.close();
    }
}