import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int H = sc.nextInt();
        int I = sc.nextInt();
        int A = sc.nextInt();
        int R = sc.nextInt();
        int C = sc.nextInt();
        
        int first = H * I;
        int second = A * R * C;
        
        System.out.print(first - second);
    }
}