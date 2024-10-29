package Easy;

public class HeightBalancedBinaryTree {
    public boolean isBalanced(TreeNode root) {
        return checkBalance(root) != -1;
    }

    private int checkBalance(TreeNode root) {
        if (root == null) {
            return 0;
        }

        int leftHeight = checkBalance(root.left);
        if (leftHeight == -1) {
            return -1;
        }

        int rightHeight = checkBalance(root.right);
        if (rightHeight == -1) {
            return -1;
        }

        if (Math.abs(rightHeight - leftHeight) > 1) {
            return -1;
        }

        return Math.max(rightHeight + 1, leftHeight + 1);
    }

}
