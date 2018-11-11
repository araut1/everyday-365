import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    // Complete the countApplesAndOranges function below.
    static void countApplesAndOranges(int s, int t, int a, int b, int[] apples, int[] oranges) {

        int[] applesPos = new int[apples.length];
        int[] orangesPos = new int[oranges.length];
        int countApples = apples.length;
        int countApplesOnHouse = 0;
        int countOranges = oranges.length;
        int countOrangesOnHouse = 0;

        for (int i = 0; i < countApples; i++) {

            applesPos[i] = apples[i] + a;
        }

        for (int i = 0; i < countOranges; i++) {
            orangesPos[i] = oranges[i] + b;

        }

        for (int i = 0; i < countApples; i++) {

            if (applesPos[i] >= s && applesPos[i] <= t) {
                countApplesOnHouse++;
            }
        }

        for (int i = 0; i < countOranges; i++) {

            if (orangesPos[i] >= s && orangesPos[i] <= t) {
                countOrangesOnHouse++;
            }

        }

        System.out.println(countApplesOnHouse);
        System.out.println(countOrangesOnHouse);
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        String[] st = scanner.nextLine().split(" ");

        int s = Integer.parseInt(st[0]);

        int t = Integer.parseInt(st[1]);

        String[] ab = scanner.nextLine().split(" ");

        int a = Integer.parseInt(ab[0]);

        int b = Integer.parseInt(ab[1]);

        String[] mn = scanner.nextLine().split(" ");

        int m = Integer.parseInt(mn[0]);

        int n = Integer.parseInt(mn[1]);

        int[] apples = new int[m];

        String[] applesItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < m; i++) {
            int applesItem = Integer.parseInt(applesItems[i]);
            apples[i] = applesItem;
        }

        int[] oranges = new int[n];

        String[] orangesItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < n; i++) {
            int orangesItem = Integer.parseInt(orangesItems[i]);
            oranges[i] = orangesItem;
        }

        countApplesAndOranges(s, t, a, b, apples, oranges);

        scanner.close();
    }
}
