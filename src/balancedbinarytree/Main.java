package balancedbinarytree;

import datastructure.TreeNode;

public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();
        TreeNode treeNode = new TreeNode(1);
        treeNode.left = new TreeNode(2);
        treeNode.left.left = new TreeNode(4);
        treeNode.left.left.left = new TreeNode(5);
        treeNode.right = new TreeNode(3);
        Boolean ans = solution.isBalanced(treeNode);
        System.out.println(ans);
    }
}
