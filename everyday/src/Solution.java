import java.util.*;

class Solution {

    static int countPairsWithDiffK(List<Integer> numbers, int k)
    {
        int ans = 0;
        int len = numbers.size();

        // sort numbers
        Collections.sort(numbers);

        int left = 0;
        int right = 0;



        while(right < len)
        {
            if(numbers.get(right)- numbers.get(left) == k)
            {
                ans++;
                left++;
                right++;
            }
            else if(numbers.get(right)- numbers.get(left) > k)
                left++;
            else
                right++;
        }
        return ans;
    }
    public static void main(String[] args) {

        int[] input = new int[]{2, 3, 6, 7};
//        int[][] input = new int[][]{{1, 0}, {0, 1}};
//        Node root = null;

    }


}


