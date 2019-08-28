/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class Solution {
        public TreeNode tree(int[] nums, int l, int r) {


        if(l>r){
            return null;
        }

        TreeNode root;

        int mid = l + (r-l)/2;

        root = new TreeNode(nums[mid]);

        root.left = tree(nums,l,mid-1);

        root.right = tree(nums,mid+1,r);

        return root;

    }

    public TreeNode sortedArrayToBST(int[] nums) {

        if(nums.length == 0){
            return null;
        }
        return tree(nums,0,nums.length-1);

    }
}
