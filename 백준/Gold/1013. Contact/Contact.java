
import java.io.*;
import java.util.*;
import java.util.regex.*;

public class Main {

    public static void main (String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        Pattern pattern = Pattern.compile("^(100+1+|01)+$");

        for (int i = 0; i < n; i++) {
            String line = br.readLine();
            Matcher matcher = pattern.matcher(line);

            if(matcher.matches()) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }

        }
    }
}
