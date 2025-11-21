import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // 현재 시간 파싱
        String[] t1 = sc.next().split(":");
        int curSec = Integer.parseInt(t1[0]) * 3600 + Integer.parseInt(t1[1]) * 60 + Integer.parseInt(t1[2]);
        
        // 던질 시간 파싱
        String[] t2 = sc.next().split(":");
        int dropSec = Integer.parseInt(t2[0]) * 3600 + Integer.parseInt(t2[1]) * 60 + Integer.parseInt(t2[2]);
        
        int diff = dropSec - curSec;
        
        // 던질 시간이 현재 시간보다 빠르거나 같으면 내일 던지는 것이므로 24시간(86400초) 더함
        if (diff <= 0) {
            diff += 24 * 3600;
        }
        
        int h = diff / 3600;
        int m = (diff % 3600) / 60;
        int s = diff % 60;
        
        System.out.printf("%02d:%02d:%02d", h, m, s);
    }
}