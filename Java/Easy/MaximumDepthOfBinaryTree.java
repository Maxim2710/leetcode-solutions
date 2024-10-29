package Easy;

public class MaximumDepthOfBinaryTree {
    public int maxDepth(TreeNode root) {
        if (root == null) {
            return 0;
        }

        int rightMaxDepth = maxDepth(root.right);
        int leftMaxDepth = maxDepth(root.left);

        return Math.max(rightMaxDepth + 1, leftMaxDepth + 1);
    }

}
