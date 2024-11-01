package Easy;

public class DiameterOfBinaryTree {
    private int maxDiameter = 0;

    public int diameterOfBinaryTree(TreeNode root) {
        calculateLength(root);
        return maxDiameter;
    }

    private int calculateLength(TreeNode root) {
        if (root == null) {
            return 0;
        }

        int leftPoint = calculateLength(root.left);
        int rightPoint = calculateLength(root.right);

        maxDiameter = Math.max(maxDiameter, leftPoint + rightPoint);

        return Math.max(leftPoint, rightPoint) + 1;
    }
}
