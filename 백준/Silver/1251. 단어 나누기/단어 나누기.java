
import java.io.*;
import java.util.*;

public class Main {

    public static void main (String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = br.readLine();
        int len = input.length();

        String maxString = "";
        for (int i = 1; i < len - 1; i++) {
            for (int j = i + 1; j < len; j++) {
                StringBuilder sub1 = new StringBuilder(input.substring(0, i));
                StringBuilder sub2 = new StringBuilder(input.substring(i, j));
                StringBuilder sub3 = new StringBuilder(input.substring(j, len));

                String resultSting = sub1.reverse().append(sub2.reverse()).append(sub3.reverse()).toString();
                if (i == 1 && j == i+ 1) maxString = resultSting;
                if (resultSting.compareTo(maxString) < 0) {
                    maxString = resultSting;
                }
            }
        }
        System.out.println(maxString);

    }
}