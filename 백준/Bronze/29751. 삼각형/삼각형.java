import java.util.*;
import java.io.*;

public class Main {
    public static void main (String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] tokens = br.readLine().split(" ");
        
        int h = Integer.parseInt(tokens[0]);
        int w = Integer.parseInt(tokens[1]);
        
        System.out.printf("%.1f", (h * w) / (double) 2 );
    }
}