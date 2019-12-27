package Solutions.preorder;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class Solution {
    public List<Integer> preorderTraversal(TreeNode root) {
        Stack<TreeNode> stack = new Stack<>();
        stack.push(root);
        List<Integer> integerList = new ArrayList<>();
        while(!stack.empty()) {
            TreeNode topEl = stack.pop();
            integerList.add(topEl.val);
            if (topEl.right != null) {
                stack.add(topEl.right);
            }
            if (topEl.left != null) {
                stack.add(topEl.left);
            }
        }
        return integerList;
    }
}
