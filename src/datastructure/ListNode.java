package datastructure;

public class ListNode {
    public int val;
    public ListNode next = null;

    public ListNode(int x) {
        val = x;
    }

    public ListNode(int x[]) {
        this(x, 0);
    }

    private ListNode(int[] x, int p) {
        if (p < x.length - 1) {
            this.next = new ListNode(x, p + 1);
            this.val = x[p];
        } else if (p < x.length) {
            this.val = x[p];
        }
    }


    public void show() {
        System.out.print(val);
        if (next != null) {
            System.out.print("->");
            next.show();
        }
    }
}
