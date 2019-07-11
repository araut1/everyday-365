class Solution {
    public int missingNumber(int[] nums) {
       
    int missingNum = nums.length;
        int[] temp = nums;

        Arrays.sort(temp);

        for (int i = 0; i < temp.length; i++) {

            if (nums[i] != i) {
                missingNum =i;
                break;


            }

        }


        return missingNum;}
}
