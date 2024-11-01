package Easy;

import java.util.ArrayList;
import java.util.List;

public class NaryTreePostorderTraversal {
    public List<Integer> postorder(Node root) {
        List<Integer> result = new ArrayList<>();
        postorderHelper(root, result);
        return result;
    }

    private void postorderHelper(Node root, List<Integer> result) {
        if (root == null) {
            return;
        }

        for (Node child : root.children) {
            postorderHelper(child, result);
        }

        result.add(root.val);
    }
}

class Node {
    public int val;
    public List<Node> children;

    public Node() {}

    public Node(int _val) {
        val = _val;
    }

    public Node(int _val, List<Node> _children) {
        val = _val;
        children = _children;
    }
}