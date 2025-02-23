
import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException{
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int n = Integer.parseInt(br.readLine());
    int m = Integer.parseInt(br.readLine());
    String s = br.readLine();

    StringBuilder pn = new StringBuilder();
    for (int i = 0; i < n; i++) {
        pn.append("IO");
    }
    pn.append("I");
    int pnLen = pn.length();

    int count = 0;
    for (int i = 0; i < m - pnLen + 1; i++) {
        String sub = s.substring(i, i + pnLen);
        if (sub.equals(pn.toString())) count++;
    }

    System.out.println(count);
    }
}
