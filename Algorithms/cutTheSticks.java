import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    // Complete the cutTheSticks function below.
    static int[] cutTheSticks(int[] arr) {


        int temp = 0;
        int sub = 0;

        ArrayList<Integer> al = new ArrayList<>(0);
        ArrayList<Integer> countSticks = new ArrayList<>(0);

        for (int i = 0; i < arr.length; i++) {
            al.add(arr[i]);
        }

        while (al.size() != 0) {
            countSticks.add(al.size());
            sub = Collections.min(al);
            for (int i = 0; i < al.size(); i++) {
                temp = al.get(i) - sub;
                al.remove(i);
                al.add( i,temp);
            }
            for (int i = al.size()-1; i >=0; i--) {
                if (al.get(i) == 0) {
                    al.remove(i);
                }
            }
        }
        int count[] = new int[countSticks.size()];
        for (int i = 0; i < countSticks.size(); i++) {
            count[i] = countSticks.get(i);
        }
        return count;




    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int[] arr = new int[n];

        String[] arrItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < n; i++) {
            int arrItem = Integer.parseInt(arrItems[i]);
            arr[i] = arrItem;
        }

        int[] result = cutTheSticks(arr);

        for (int i = 0; i < result.length; i++) {
            bufferedWriter.write(String.valueOf(result[i]));

            if (i != result.length - 1) {
                bufferedWriter.write("\n");
            }
        }

        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
    }
}
