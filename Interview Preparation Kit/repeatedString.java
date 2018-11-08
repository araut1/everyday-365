import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    // Complete the repeatedString function below.
    static long repeatedString(String s, long n) {
        long len = s.length();
        long a;
        long sa=0;
        long ra=0;
        long rep=0;
        long rem=0;
        
        rep = (long)n/(long)len;
        rem = (long)n%(long)len;

        for (int i = 0; i < len; i++) {
            if(s.charAt(i) == 'a')
            {
                sa++;
            }
            
        }
        for (int i = 0; i < rem; i++) {
            if(s.charAt(i) == 'a')
            {
                ra++;
            }

        }
        
        a = sa * rep + ra;
        return a;

    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String s = scanner.nextLine();

        long n = scanner.nextLong();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        long result = repeatedString(s, n);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
    }
}
