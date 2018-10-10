import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */

        int index;
        double wmean;
        int numerator = 0;
        double denominator =0;

        Scanner sc = new Scanner(System.in);

        index = sc.nextInt();
        int[] numb = new int[index];
        int[] wts = new int[index];


        for (int i = 0; i < numb.length; i++) {

            numb[i] = sc.nextInt();

        }

        for (int i = 0; i < numb.length; i++) {

            wts[i] = sc.nextInt();

        }

        for (int i = 0; i < numb.length; i++) {

            numerator = numerator + wts[i] * numb[i];

        }

        for (int i = 0; i < numb.length; i++) {

            denominator = denominator + (double)wts[i] ;

        }
        wmean = numerator / denominator;

        System.out.println(String.format("%.1f",wmean));

    }
}