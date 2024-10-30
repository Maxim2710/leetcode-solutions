package Easy;

public class SortedArrayToBST {
    public TreeNode sortedArrayToBST(int[] nums) {
        TreeNode root = buildBST(nums, 0, nums.length - 1);
        return root;
    }

    private TreeNode buildBST(int[] nums, int start, int end) {
        if (start > end) {
            return null;
        }

        int middle = (start + end) / 2;
        TreeNode middleNode = new TreeNode(nums[middle]);

        middleNode.left = buildBST(nums, start, middle - 1);
        middleNode.right = buildBST(nums, middle + 1, end);

        return middleNode;
    }
}
