import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 재수강할 과목 코드 입력
        String retakeCourseCode = sc.nextLine();
        
        // 수강 신청 가능한 과목의 개수 입력
        int N = sc.nextInt();
        sc.nextLine(); // 버퍼 비우기

        int count = 0;
        
        // N개의 과목 코드를 비교
        for (int i = 0; i < N; i++) {
            String availableCourseCode = sc.nextLine();
            
            // 앞 5자리를 잘라내어 비교
            if (retakeCourseCode.substring(0, 5).equals(availableCourseCode.substring(0, 5))) {
                count++;
            }
        }
        
        System.out.println(count);
        
        sc.close();
    }
}