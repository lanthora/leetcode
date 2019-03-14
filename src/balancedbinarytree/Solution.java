package balancedbinarytree;

import datastructure.TreeNode;

import java.util.HashMap;
import java.util.Map;

public class Solution {
    public boolean isBalanced(TreeNode root) {

        if (root == null) return true;
        int leftDepth = Depth(root.left);
        int rightDepth = Depth(root.right);
        if (Math.abs(leftDepth - rightDepth) > 1)
            return false;

        else if (isBalanced(root.left) && isBalanced(root.right))
            return true;
        else
            return false;
    }

    private Map<Object, Integer> map = new HashMap();

    public int Depth(TreeNode root) {
        /*
         * 优化后的时间复杂度更大，大概是测试数据集很小
         * */
        if (root == null) return 0;
        if (map.containsKey(root.hashCode())) {
            return map.get(root.hashCode());
        } else {
            int tmp = Math.max(Depth(root.left), Depth(root.right)) + 1;
            map.put(root.hashCode(), tmp);
            return tmp;
        }
    }
}
