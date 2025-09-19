import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) throws IOException {
        // 1. 세미나와 강의실 정보를 Map에 저장합니다.
        Map<String, String> seminarMap = new HashMap<>();
        seminarMap.put("Algorithm", "204");
        seminarMap.put("DataAnalysis", "207");
        seminarMap.put("ArtificialIntelligence", "302");
        seminarMap.put("CyberSecurity", "B101");
        seminarMap.put("Network", "303");
        seminarMap.put("Startup", "501");
        seminarMap.put("TestStrategy", "105");

        // 2. 입력을 받기 위한 BufferedReader를 생성합니다.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        // 3. 신청한 세미나의 수를 입력받습니다.
        int n = Integer.parseInt(br.readLine());

        // 4. StringBuilder를 사용하여 출력 속도를 향상시킵니다.
        StringBuilder sb = new StringBuilder();

        // 5. n번 반복하여 세미나 이름을 입력받고, Map에서 해당하는 강의실을 찾습니다.
        for (int i = 0; i < n; i++) {
            String seminar = br.readLine();
            sb.append(seminarMap.get(seminar)).append("\n");
        }

        // 6. 결과를 한 번에 출력합니다.
        System.out.print(sb);
    }
}