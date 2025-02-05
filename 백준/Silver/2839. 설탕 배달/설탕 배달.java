import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        int ans = -1;
        for (int i = n / 5; i >= 0; i--) {
            int rem = n - 5 * i;
                if (rem % 3 == 0) {
                    ans = i + rem / 3;
                    break;  // i를 내림차순으로 탐색하므로 최초 발견 시 최소 봉지 수임
                }
            }
            System.out.println(ans);

       }
}