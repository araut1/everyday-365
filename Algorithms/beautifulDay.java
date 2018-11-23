import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

      static int reverseNum(int num) {
        int reverse = 0;

        while (num != 0) {
            reverse = reverse * 10 + num % 10;
            num /= 10;
        }

        return reverse;
    }

    // Complete the beautifulDays function below.
    static int beautifulDays(int i, int j, int k) {
        int beauty = 0;
        int num = i;
        int rev = 0;

        while (num >= i && num <= j) {
            rev = reverseNum(num);

            if ((Math.abs(num - rev))%k == 0) {
                beauty++;
            }
num++;
        }

        return beauty;
    }


    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String[] ijk = scanner.nextLine().split(" ");

        int i = Integer.parseInt(ijk[0]);

        int j = Integer.parseInt(ijk[1]);

        int k = Integer.parseInt(ijk[2]);

        int result = beautifulDays(i, j, k);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
    }
}
