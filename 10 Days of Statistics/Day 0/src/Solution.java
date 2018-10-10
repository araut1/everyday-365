
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;


/**
 * take in size of array and elements are output mean, mode, and median
 */
public class Solution {


    public static void main(String[] args) {

        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */

        int index;
        int pos;
        double mean;
        double median;
        double mode;
        double sum = 0;


        Scanner sc = new Scanner(System.in);
        System.out.println("Input Index");

        index = sc.nextInt();

        int[] nums = new int[index];

        System.out.println("Array Size: " + nums.length);

        for (int i = 0; i < nums.length; i++) {
            nums[i] = sc.nextInt();
        }

        Arrays.sort(nums);
        System.out.println("\nArray: ");
        System.out.println(Arrays.toString(nums));

        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];
        }
        mean = sum / (nums.length);

        if ((nums.length % 2) == 0) {

            pos = (nums.length / 2);
            median =  (nums[pos] + nums[pos-1]) / 2.0;
        } else {
            pos = (int) Math.floor(nums.length / 2.0);
            median =  nums[pos];
        }

        mode =0;

        System.out.println("Mean: "+ mean+" Median: "+ median+" Mode: "+ mode);


    }
}
