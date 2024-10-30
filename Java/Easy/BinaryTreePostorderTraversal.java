package Easy;

import java.util.ArrayList;
import java.util.List;

public class BinaryTreePostorderTraversal {
    public List<Integer> postorderTraversal(TreeNode root) {
        List<Integer> resultList = new ArrayList<>();
        travelToNodes(root, resultList);
        return resultList;
    }

    private void travelToNodes(TreeNode root, List<Integer> resultList) {
        if (root == null) {
            return;
        }

        resultList.add(root.val);

        travelToNodes(root.left, resultList);

        travelToNodes(root.right, resultList);
    }
}
