
import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException
    {
     BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
     int n = Integer.parseInt(br.readLine());
     int rTemp, gTemp, bTemp;
     int curR, curG, curB;
     int prevR = 0, prevG = 0, prevB = 0;

     for (int i = 0; i < n; i++) {
         StringTokenizer st = new StringTokenizer(br.readLine());
         curR = Integer.parseInt(st.nextToken());
         curG = Integer.parseInt(st.nextToken());
         curB = Integer.parseInt(st.nextToken());

         if (i == 0) {
             prevR += curR; prevG += curG; prevB += curB;
             continue;
         }

         rTemp = Math.min(curR + prevG, curR + prevB);
         gTemp = Math.min(curG + prevR, curG + prevB);
         bTemp = Math.min(curB + prevR, curB + prevG);

         prevR = rTemp;
         prevG = gTemp;
         prevB = bTemp;
     }

     int min = Math.min(prevR, prevG);
     min = Math.min(min, prevB);
     System.out.println(min);

    }

}
