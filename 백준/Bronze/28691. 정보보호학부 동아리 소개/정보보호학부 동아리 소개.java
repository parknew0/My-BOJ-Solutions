import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // 민재가 이야기한 동아리의 첫 번째 글자를 읽습니다.
        String firstChar = sc.next();
        
        // 첫 글자에 따라 해당하는 동아리 전체 이름을 출력합니다.
        switch (firstChar) {
            case "M":
                System.out.println("MatKor");
                break;
            case "W":
                System.out.println("WiCys");
                break;
            case "C":
                System.out.println("CyKor");
                break;
            case "A":
                System.out.println("AlKor");
                break;
            case "$":
                System.out.println("$clear");
                break;
            default:
                // 문제 조건에 따라 M, W, C, A, $ 중 하나만 들어오므로 default는 실행되지 않습니다.
                break;
        }
        
        sc.close();
    }
}