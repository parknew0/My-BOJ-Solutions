import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 시간 입력 파싱 (예: 4:30 PM)
        String[] timeParts = sc.next().split(":");
        int h = Integer.parseInt(timeParts[0]);
        int m = Integer.parseInt(timeParts[1]);
        String ampm = sc.next();

        // 이동 시간 입력
        int t = sc.nextInt();

        // 24시간 형식의 분으로 변환
        // 12 AM -> 0시, 12 PM -> 12시, 그 외 PM -> +12시간
        if (ampm.equals("AM") && h == 12) {
            h = 0;
        } else if (ampm.equals("PM") && h != 12) {
            h += 12;
        }

        int totalMinutes = h * 60 + m;

        // 이동 시간 차감
        totalMinutes -= t;

        // 음수일 경우 (전날로 넘어감) 처리
        while (totalMinutes < 0) {
            totalMinutes += 24 * 60;
        }

        // 다시 시간 포맷으로 변환
        int finalH = (totalMinutes / 60) % 24;
        int finalM = totalMinutes % 60;

        String finalAmpm;
        if (finalH < 12) {
            finalAmpm = "AM";
            if (finalH == 0) finalH = 12; // 0시는 12 AM
        } else {
            finalAmpm = "PM";
            if (finalH > 12) finalH -= 12; // 13시~23시는 1~11 PM
        }

        // 출력 형식 맞춤 (시간은 패딩 없음, 분은 2자리 0패딩)
        System.out.printf("%d:%02d %s", finalH, finalM, finalAmpm);
        
        sc.close();
    }
}