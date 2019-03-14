package binarytreepostordertraversal;

import datastructure.TreeNode;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class Solution {
    private boolean can_print(TreeNode current, TreeNode previous) {
        if (current.left == null && current.right == null) {
            /* 叶子节点 */
            return true;
        } else if (previous != null && (previous == current.left || previous == current.right)) {
            /* 子节点已经被访问过的节点 */
            return true;
        }
        return false;
    }

    public List<Integer> postorderTraversal(TreeNode root) {

        if (root == null) {
            return new ArrayList<>();
        }

        Stack<TreeNode> stack = new Stack<>();
        stack.push(root);
        List<Integer> ans = new ArrayList<>();
        TreeNode current;
        TreeNode previous = null;
        while (!stack.empty()) {
            current = stack.peek();
            if (this.can_print(current, previous)) {
                ans.add(current.val);
                stack.pop();
                previous = current;
            } else {
                /* 先右子树进栈 */
                if (current.right != null) {
                    stack.push(current.right);
                }
                if (current.left != null) {
                    stack.push(current.left);
                }
            }
        }
        return ans;
    }
}
