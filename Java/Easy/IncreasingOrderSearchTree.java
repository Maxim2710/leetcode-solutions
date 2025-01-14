package Easy;

public class IncreasingOrderSearchTree {
    private TreeNode prev = null;

    public TreeNode increasingBST(TreeNode root) {
        if (root == null) {
            return null;
        }

        TreeNode newRoot = increasingBST(root.left);

        if (prev != null) {
            prev.right = root;
        }
        root.left = null;
        prev = root;

        root.right = increasingBST(root.right);

        return newRoot == null ? root : newRoot;
    }
}
