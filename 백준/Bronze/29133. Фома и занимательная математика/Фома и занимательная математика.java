import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        long a = sc.nextLong();
        long b = sc.nextLong();
        long c = sc.nextLong();
        long d = sc.nextLong();
        
        List<Integer> answers = new ArrayList<>();
        
        // x = 1 일 때 확인
        if (Math.pow(a, 1) + Math.pow(b, 1) + Math.pow(c, 1) == d) {
            answers.add(1);
        }
        
        // x = 2 일 때 확인
        if (Math.pow(a, 2) + Math.pow(b, 2) + Math.pow(c, 2) == d) {
            answers.add(2);
        }
        
        // x = 3 일 때 확인
        if (Math.pow(a, 3) + Math.pow(b, 3) + Math.pow(c, 3) == d) {
            answers.add(3);
        }
        
        // 유일한 해인지 판별
        if (answers.size() == 1) {
            System.out.println(answers.get(0));
        } else {
            System.out.println("-1");
        }
        
        sc.close();
    }
}