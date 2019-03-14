package mergeksortedlists;

import datastructure.ListNode;

public class Main {
    public static void main(String[] args) {
        ListNode[] listNodes = new ListNode[3];
//        listNodes[0] = new ListNode(new int[]{1, 4, 5});
//        listNodes[1] = new ListNode(new int[]{1, 3, 4});
//        listNodes[2] = new ListNode(new int[]{2, 6});
        Solution solution = new Solution();
        ListNode listNode = solution.mergeKLists(null);
        listNode.show();
    }
}
