package binarytreepostordertraversal;

import datastructure.TreeNode;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        TreeNode treeNode = new TreeNode(1);
        treeNode.right = new TreeNode(2);
        treeNode.right.left = new TreeNode(3);
        Solution solution = new Solution();
        List<Integer> list = solution.postorderTraversal(treeNode);
        System.out.println(list);
    }
}
