package leetCodeOne;

import java.util.Scanner;

public class Driver {
    public static void main(String[] args) {

        int[] nums = {0, 1, 2, 3, 4, 5};
        int target;
        System.out.println("Input Sum:");
        Scanner sc = new Scanner(System.in);
        target = sc.nextInt();
        Solution sol1 = new Solution();

        int[] ret = new int[2];

        ret = sol1.twoSum(nums, target);
        System.out.println("{0,1,2,3,4,5}");
        System.out.println("[" + ret[0] + "," + ret[1] + "]");

    }
}
