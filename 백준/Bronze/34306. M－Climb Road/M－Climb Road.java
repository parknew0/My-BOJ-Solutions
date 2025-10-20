import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int W = sc.nextInt();
        int N = sc.nextInt();
        
        int totalFeet = W * 5280;
        int squirts = totalFeet / N;
        
        System.out.println(squirts);
        
        sc.close();
    }
}