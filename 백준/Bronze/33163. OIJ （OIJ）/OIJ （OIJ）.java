import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String s = sc.next();
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < n; i++) {
            char c = s.charAt(i);
            if (c == 'J') {
                result.append('O');
            } else if (c == 'O') {
                result.append('I');
            } else if (c == 'I') {
                result.append('J');
            }
        }
        System.out.println(result.toString());
        sc.close();
    }
}