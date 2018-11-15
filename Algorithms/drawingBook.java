import java.io.*;
import java.math.*;
import java.text.*;
import java.util.*;
import java.util.regex.*;

public class Solution {

    /*
     * Complete the pageCount function below.
     */
    static int pageCount(int n, int p) {
         int pCount = 0;
        int leftTurns = -1;
        int rightTurns = -1;

        // left page turns
        for (int i = 0; i <= n; i = i + 2) {

            leftTurns++;
            if ((i == p) || (i + 1 == p)) {
                break;
            }
        }

        // right page turns

        if (n % 2 == 0) {

            for (int i = n; i >= 0; i = i - 2) {

                rightTurns++;
                if ((i == p) || (i + 1 == p)) {
                    break;
                }

            }
        } else {

            for (int i = n; i >= 1; i = i - 2) {

                rightTurns++;
                if ((i == p) || (i - 1 == p)) {
                    break;
                }

            }
        }
        pCount = leftTurns <= rightTurns ? leftTurns : rightTurns;
        return pCount;

    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])*");

        int p = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])*");

        int result = pageCount(n, p);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
    }
}
