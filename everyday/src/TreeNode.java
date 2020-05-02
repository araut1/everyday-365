import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode() {
    }

    TreeNode(int val) {
        this.val = val;
    }

    TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }

    // BFS - level by level traversal
    public static void printT(TreeNode root) {
        List<List<String>> res = new ArrayList<List<String>>();

        LinkedList<TreeNode> q = new LinkedList<>();

        q.add(root);

        while (!q.isEmpty()) {

            TreeNode node = q.remove();

            if (node == null) {

            } else {

            }

        }

        System.out.println(res);
    }
}
