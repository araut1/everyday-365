import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    // Complete the anagram function below.
     static int anagram(String s) {


        if (s == null || s.length() == 0 || s.length() % 2 != 0) {
            return -1;
        }

        int len = s.length();
        int secondStart = len / 2;
        int ret = len / 2;
        char c;

        Map<Character, Integer> map = new HashMap<>();

        for (int i = 0; i < secondStart; i++) {

            if (map.containsKey(s.charAt(i))) {
                map.put(s.charAt(i), map.get(s.charAt(i)) + 1);
            } else {
                map.put(s.charAt(i), 1);
            }
        }

        for (int i = secondStart; i < len; i++) {

            c = s.charAt(i);

            if (map.containsKey(c)){
              ret--;

              map.put(s.charAt(i), map.get(s.charAt(i)) - 1);

              if(map.get(s.charAt(i)) == 0){
                  map.remove(c);
              }
            }


        }

        return ret;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int q = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int qItr = 0; qItr < q; qItr++) {
            String s = scanner.nextLine();

            int result = anagram(s);

            bufferedWriter.write(String.valueOf(result));
            bufferedWriter.newLine();
        }

        bufferedWriter.close();

        scanner.close();
    }
}
