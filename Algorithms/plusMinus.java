import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    // Complete the plusMinus function below.
    static void plusMinus(int[] arr) {

        double p=0;
        double n=0;
        double z=0;
        double t=0;
        t = arr.length;
        
        for(int i: arr )
        {
            if(i>0)
            {
                p++;
            }
            else if(i<0)
            {
                n++;
            }
            else
            {
                z++;
            }
        }
        
        p/=t;
        n/=t;
        z/=t;
        
        System.out.printf("%f\n",p);
        System.out.printf("%f\n",n);
        System.out.printf("%f\n",z);


    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int[] arr = new int[n];

        String[] arrItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < n; i++) {
            int arrItem = Integer.parseInt(arrItems[i]);
            arr[i] = arrItem;
        }

        plusMinus(arr);

        scanner.close();
    }
}
