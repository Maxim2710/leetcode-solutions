package Hard;

import java.util.HashMap;
import java.util.Map;

public class TwoDFSTraversals {
    private Map<TreeNode, Integer> heightMap = new HashMap<>();
    private int[] heights;

    public int[] treeQueries(TreeNode root, int[] queries) {
        computeHeights(root);
        heights = new int[heightMap.size() + 1];
        heightMap.put(null, 0);
        calculateResult(root, -1, 0);
        int queryCount = queries.length;
        int[] answer = new int[queryCount];
        for (int i = 0; i < queryCount; ++i) {
            answer[i] = heights[queries[i]];
        }
        return answer;
    }

    private void calculateResult(TreeNode node, int depth, int maxHeight) {
        if (node == null) {
            return;
        }
        ++depth;
        heights[node.val] = maxHeight;
        calculateResult(node.left, depth, Math.max(maxHeight, depth + heightMap.get(node.right)));
        calculateResult(node.right, depth, Math.max(maxHeight, depth + heightMap.get(node.left)));
    }

    private int computeHeights(TreeNode node) {
        if (node == null) {
            return 0;
        }
        int leftHeight = computeHeights(node.left);
        int rightHeight = computeHeights(node.right);
        heightMap.put(node, 1 + Math.max(leftHeight, rightHeight));
        return heightMap.get(node);
    }
}

class TreeNode {
     int val;
     TreeNode left;
     TreeNode right;
     TreeNode() {}
     TreeNode(int val) { this.val = val; }
     TreeNode(int val, TreeNode left, TreeNode right) {
     this.val = val;
     this.left = left;
     this.right = right;
    }
}