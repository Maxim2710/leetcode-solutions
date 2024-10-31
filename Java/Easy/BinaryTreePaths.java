package Easy;

import java.util.ArrayList;
import java.util.List;

public class BinaryTreePaths {
    public List<String> binaryTreePaths(TreeNode root) {
        List<String> listPaths = new ArrayList<>();
        if (root != null) {
            dfs(root, "", listPaths);
        }

        return listPaths;
    }

    private void dfs(TreeNode root, String s, List<String> listPaths) {
        if (root.right == null && root.left == null) {
            listPaths.add(s + root.val);
        } else {
            if (root.left != null) {
                dfs(root.left, s + root.val + "->", listPaths);
            }

            if (root.right != null) {
                dfs(root.right, s + root.val + "->", listPaths);
            }
        }
    }
}
