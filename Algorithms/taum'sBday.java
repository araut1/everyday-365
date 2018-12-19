import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    // Complete the taumBday function below.


  static long taumBday( long b, long w, long bc, long wc, long z) {

        long[] costCombi = new long[3];
        // index: 0 -> no conversion; 1-> black to white conversion; 2-> white to black conversion
        long t = b + w;

        // no conversion
        costCombi[0] = b * bc + w * wc;

        // b to w
        costCombi[1] = t * bc + w * z;

        // w to b
        costCombi[2] = t * wc + b * z;

        Arrays.sort(costCombi);
        return costCombi[0];
    }











    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int t = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int tItr = 0; tItr < t; tItr++) {
            String[] bw = scanner.nextLine().split(" ");

            int b = Integer.parseInt(bw[0]);

            int w = Integer.parseInt(bw[1]);

            String[] bcWcz = scanner.nextLine().split(" ");

            int bc = Integer.parseInt(bcWcz[0]);

            int wc = Integer.parseInt(bcWcz[1]);

            int z = Integer.parseInt(bcWcz[2]);

            long result = taumBday(b, w, bc, wc, z);

            bufferedWriter.write(String.valueOf(result));
            bufferedWriter.newLine();
        }

        bufferedWriter.close();

        scanner.close();
    }
}
