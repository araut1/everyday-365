package leetCodeOne;

public class Solution {

    public int[] twoSum(int[] nums, int target) {

        int sum = 0;
        int i, j;
        int arrayLength = nums.length;
        final int[] ret = new int[2];
        boolean flag = false;


        for (i = 0; i < arrayLength; i++) {

            for (j = 0; j < arrayLength; j++) {
                if (i != j) {
                    sum = nums[i] + nums[j];

                    if (sum == target && !flag) {
                        ret[0] = i;
                        ret[1] = j;
                        flag = true;
                        break;
                    }
                }

            }
            if (flag)
            {
                break;
            }
        }

        return ret;

    }
}

