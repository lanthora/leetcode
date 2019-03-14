package removenthnodefromendoflist;

import datastructure.ListNode;

public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();
        int [] x = {1,2,3,4,5};
        ListNode head = new ListNode(x);
        ListNode ans = solution.removeNthFromEnd(head, 2);
        ans.show();
    }
}
