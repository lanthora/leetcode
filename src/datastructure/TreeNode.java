package datastructure;


public class TreeNode {
    public int val;
    public TreeNode left;
    public TreeNode right;

    public TreeNode(int x) {
        val = x;
    }

    private void show(TreeNode root) {
        if (root != null) {
            System.out.println(root.val);
            this.show(root.left);
            this.show(root.right);
        } else {
            System.out.println("null");
        }
    }

    public void show() {
        this.show(this);
    }
}

