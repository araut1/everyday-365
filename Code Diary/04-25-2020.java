import java.util.*;

class Solution {


    static public boolean path(int[] nums,boolean[] track, int i, int j) {

        if (i > j || track[i] == false) {
            return false;
        }

        if (i == j) {
            return true;
        }

        for (int k = 1; k <= nums[i]; k++) {
            if (path(nums, track, i + k, nums.length - 1)) {
                return true;
            }
            track[i+k] = false;
        }
        return false;
    }


    static public boolean canJump(int[] nums) {

        if (nums.length == 0) {
            return true;
        }
        boolean[] track = new boolean[nums.length];
        Arrays.fill(track,true);

        return path(nums, track,0, nums.length - 1);

    }

    public static void main(String[] args) {
        System.out.println(canJump(new int[]{3,2,1,0,4}));

    }


}


