
import java.io.*;
import java.util.*;

public class Main {

    public static void main (String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] input = br.readLine().split(" ");
        String a = input[0];
        String b = input[1];

        int min = b.length();
        for (int i = 0; i < b.length() - a.length() + 1 ; i++) {
            String bSub = b.substring(i, i + a.length());
            int difference = 0;
            for (int j = 0 ; j < a.length() ; j++) {
                if (a.charAt(j) != bSub.charAt(j)) {
                    difference++;
                }
            }
            min = Math.min(min, difference);
        }
        System.out.println(min);
    }

}
