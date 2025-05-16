import java.util.*;
import java.io.*;

public class Main {
    public static final double PIE = 3.141592;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int d1 = Integer.parseInt(br.readLine());
        int d2 = Integer.parseInt(br.readLine());
        
        double len = d1 * 2 + 2 * PIE * d2;
        System.out.printf("%.6f", len);
    }
}