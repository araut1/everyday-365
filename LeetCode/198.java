class Solution {
       
public int rob(int[] nums) {

      int len = nums.length;

        if (len == 0) {
            return 0;
        }
        if (len == 1) {
            return nums[0];
        }


        int[] maxSteel = new int[len];
        maxSteel[len - 1] = nums[len - 1];
        maxSteel[len - 2] = nums[len - 2] > nums[len - 1] ? nums[len - 2] : nums[len - 1];

        for (int i = len - 3; i >= 0; i--) {

            maxSteel[i] = Math.max(nums[i] + maxSteel[i + 2], maxSteel[i + 1]);
        }

        return maxSteel[0];
    }
}
