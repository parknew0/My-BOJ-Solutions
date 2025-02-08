class Solution {
public static String solution(String video_len, String pos, String op_start, String op_end, String[] commands) {
        int commandsLength = commands.length;
        int pos_int = timeConversion(pos);

        for (int i = 0; i < commandsLength; i++) {
            pos_int = checkOpeningSkip(pos_int, timeConversion(op_start), timeConversion(op_end));
            String command = commands[i];

            if (command.contains("prev")){
                if (pos_int - 10 >= 0) {
                    pos_int -= 10;
                }
                else pos_int = 0;
            }
            if (command.contains("next")){
                if(pos_int + 10 <= timeConversion(video_len)) {
                    pos_int += 10;
                }
                else pos_int = timeConversion(video_len);
            }
        }
        pos_int = checkOpeningSkip(pos_int, timeConversion(op_start), timeConversion(op_end));


        return resultFormat(pos_int);
    }

    public static String resultFormat (int pos) {
        StringBuilder sb = new StringBuilder();

        return sb.append(String.format("%02d",pos/60)).append(":").append(String.format("%02d",pos%60)).toString();
    }

    public static int checkOpeningSkip(int pos, int op_start, int op_end)
    {
        if (op_start <= pos && pos <= op_end) {
            return op_end;
        }
        return pos;
    }

    public static int timeConversion (String videoTime) {
        String[] tokens = videoTime.split(":");
        int min = Integer.parseInt(tokens[0]);
        int sec = Integer.parseInt(tokens[1]);

        return min * 60 + sec;
    }
}