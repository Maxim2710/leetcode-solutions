package Easy;

public class MergeTwoBinaryTrees {
    public TreeNode mergeTrees(TreeNode root1, TreeNode root2) {
        if (root1 == null && root2 == null) {
            return null;
        }

        if (root1 == null) {
            return root2;
        }

        if (root2 == null) {
            return root1;
        }

        TreeNode resultAfterMerge = new TreeNode(root1.val + root2.val);

        resultAfterMerge.left = mergeTrees(root1.left, root2.left);
        resultAfterMerge.right = mergeTrees(root1.right, root2.right);

        return resultAfterMerge;
    }
}
