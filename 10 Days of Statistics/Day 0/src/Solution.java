
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

        System.out.println("\nArray Size: " + nums.length);

        for (int i = 0; i < nums.length; i++) {
            nums[i] = sc.nextInt();
        }

        Arrays.sort(nums);
        System.out.println("\nArray: ");
        System.out.println(Arrays.toString(nums));


        // mean
        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];
        }
        mean = sum / (nums.length);


        //median
        if ((nums.length % 2) == 0) {

            pos = (nums.length / 2);
            median = (nums[pos] + nums[pos - 1]) / 2.0;
        } else {
            pos = (int) Math.floor(nums.length / 2.0);
            median = nums[pos];
        }

        // mode
        mode = nums[0];
        int countMode = 1;

        for (int current : nums) {
            int count = 0;
            for (int element : nums) {
                if (current == element) {
                    count++;
                }
            }
            if (count > countMode) {
                mode = current;
                countMode = count;
            }
        }


        System.out.println("Mean: " + mean + " Median: " + median + " Mode: " + mode);


    }
}
