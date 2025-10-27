import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int n = Integer.parseInt(br.readLine());
        
        boolean allTallEnough = true;
        
        for (int i = 0; i < n; i++) {
            int height = Integer.parseInt(br.readLine());
            
            // If any height is less than 48, set the flag to false
            // and we can stop checking the rest.
            if (height < 48) {
                allTallEnough = false;
            }
        }
        
        if (allTallEnough) {
            System.out.println("True");
        } else {
            System.out.println("False");
        }
    }
}