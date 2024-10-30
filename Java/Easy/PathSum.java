package Easy;

public class PathSum {
    public boolean hasPathSum(TreeNode root, int targetSum) {
        if (root == null) {
            return false;
        }

        if (root.left == null && root.right == null) {
            return targetSum == root.val;
        }

        int mindSum = targetSum - root.val;
        return hasPathSum(root.right, mindSum) || hasPathSum(root.left, mindSum);
    }
}
