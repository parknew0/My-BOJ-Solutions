import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());

        int currentAmmo = 0;
        int savedAmmo = 0;

        for (int i = 0; i < n; i++) {
            String command = br.readLine();

            switch (command) {
                case "ammo":
                    currentAmmo += k;
                    break;
                case "shoot":
                    currentAmmo--;
                    break;
                case "save":
                    savedAmmo = currentAmmo;
                    break;
                case "load":
                    currentAmmo = savedAmmo;
                    break;
            }
            System.out.println(currentAmmo);
        }
    }
}