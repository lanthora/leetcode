package removenthnodefromendoflist;

import datastructure.ListNode;

public class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode first = head;
        ListNode second = head;
        try {
            for (int i = 0; i < n; i++) {
                second = second.next;
            }
            while (second.next != null) {
                first = first.next;
                second = second.next;
            }
            first.next = first.next.next;
            return head;
        } catch (NullPointerException e) {
            return head.next;
        }
    }
}
