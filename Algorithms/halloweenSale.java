import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    // Complete the howManyGames function below.
    static int howManyGames(int p, int d, int m, int s) {
        // Return the number of games you can buy







        int noOfGames = 0;
        int currentCredit = s;
        int gamePrice = p;

        if (currentCredit > gamePrice) {
            currentCredit = currentCredit - gamePrice;
            noOfGames++;

            while (gamePrice > m) {
                gamePrice = gamePrice - d;
                if (gamePrice > m) {
                    currentCredit = currentCredit - gamePrice;

                    if (currentCredit >= 0)
                        noOfGames++;
                }
            }

            while (currentCredit >= m) {

                currentCredit = currentCredit - m;
                if (currentCredit >= 0)
                    noOfGames++;

            }

        }

        return noOfGames;






    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String[] pdms = scanner.nextLine().split(" ");

        int p = Integer.parseInt(pdms[0]);

        int d = Integer.parseInt(pdms[1]);

        int m = Integer.parseInt(pdms[2]);

        int s = Integer.parseInt(pdms[3]);

        int answer = howManyGames(p, d, m, s);

        bufferedWriter.write(String.valueOf(answer));
        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
    }
}