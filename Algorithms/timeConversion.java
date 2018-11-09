import java.io.*;
import java.math.*;
import java.text.*;
import java.util.*;
import java.util.regex.*;

public class Solution {

    /*
     * Complete the timeConversion function below.
     */
    static String timeConversion(String s) {
        /*
         * Write your code here.
         */
         String[] t = s.split(":");

        String h = t[0];
        int hour = Integer.parseInt(h);

        if (s.charAt(8) == 'P') {
            if (hour < 12)
                hour += 12;
            h = Integer.toString(hour);
        } else {
            if (hour == 12) {
                h = "00";
            }
        }


        String minute = t[1];
        String sec = t[2].substring(0, 2);

        return h + ":" + minute + ":" + sec;

    }

    private static final Scanner scan = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bw = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String s = scan.nextLine();

        String result = timeConversion(s);

        bw.write(result);
        bw.newLine();

        bw.close();
    }
}
