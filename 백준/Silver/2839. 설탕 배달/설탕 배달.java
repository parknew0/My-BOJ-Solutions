
import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int x = (int) Math.ceil((double) n / 3 );
        int y = (int) Math.ceil((double) n / 5 );

        int min = -1;

        for (int i = 0; i <= x; i++) {
            for (int j = 0; j <= y; j++) {
                if ( 3 * i + 5 * j == n ) {
                    if (min == -1){
                        min = i + j;
                    }
                  min = Math.min(min,i + j);
                }
            }
        }
        System.out.println(min);
    }
}
