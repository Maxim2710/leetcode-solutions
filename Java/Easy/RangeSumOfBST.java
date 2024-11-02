package Easy;

public class RangeSumOfBST {
    public int rangeSumBST(TreeNode root, int low, int high) {
        return rangeSumBstHelper(root, low, high);
    }

    private int rangeSumBstHelper(TreeNode root, int low, int high) {
        if (root == null) {
            return 0;
        }

        int sum = 0;

        if (root.val >= low && root.val <= high) {
            sum += root.val;
        }

        if (root.val > low) {
            sum += rangeSumBstHelper(root.left, low, high);
        }

        if (root.val < high) {
            sum += rangeSumBstHelper(root.right, low, high);
        }

        return sum;
    }
}
