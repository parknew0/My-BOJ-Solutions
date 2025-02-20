
import java.io.*;
import java.util.*;

public class Main {

    public static void main (String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        char[][] chessBoard = new char[8][];

        for (int i = 0; i < 8; i++) {
            String s = br.readLine();
            chessBoard[i] = s.toCharArray();
        }

        int counter = 0;
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                if ((i + j) % 2 == 0 && chessBoard[i][j] == 'F') {
                    counter++;
                }
            }
        }

        System.out.println(counter);

    }

}
