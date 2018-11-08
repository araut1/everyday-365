import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    // Complete the diagonalDifference function below.
    static int diagonalDifference(int[][] arr) {


        int lr = 0;
        int rl = 0;
        int n = arr.length;
        //System.out.print(n);
    
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if(i==j){
                lr+=arr[i][j];
                }
            }
        }
        
        int l=0;
        int m= arr.length-1;
        while( l>=0 && l<arr.length && m>=0 && m<arr.length )
        {
            rl+=arr[l][m];
            l++;
            m--;
            
        }
        
        return Math.abs(lr-rl);
        
        
        
        
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int[][] arr = new int[n][n];

        for (int i = 0; i < n; i++) {
            String[] arrRowItems = scanner.nextLine().split(" ");
            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

            for (int j = 0; j < n; j++) {
                int arrItem = Integer.parseInt(arrRowItems[j]);
                arr[i][j] = arrItem;
            }
        }

        int result = diagonalDifference(arr);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
    }
}
