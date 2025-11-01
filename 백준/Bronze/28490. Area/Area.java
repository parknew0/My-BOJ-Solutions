import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        int maxArea = 0;
        
        for (int i = 0; i < n; i++) {
            int h = sc.nextInt();
            int w = sc.nextInt();
            int area = h * w;
            if (area > maxArea) {
                maxArea = area;
            }
        }
        
        System.out.println(maxArea);
        
        sc.close();
    }
}