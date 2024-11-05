package Easy;

public class EvaluateBooleanBinaryTree {
    public boolean evaluateTree(TreeNode root) {
        if (root.left == null && root.right == null) return root.val == 1;

        boolean leftEv = evaluateTree(root.left);
        boolean rightEv = evaluateTree(root.right);

        if (root.val == 2) {
            return leftEv || rightEv;
        } else if (root.val == 3) {
            return leftEv && rightEv;
        }

        return false;
    }
}
