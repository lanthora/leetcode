package reversenodesinkgroup;

import datastructure.ListNode;


public class Solution {
    public ListNode reverseKGroup(ListNode head, int k) {
        ListNode ans = new ListNode(0);
        ans.next = head;
        /* 始终指向k个的前一个 */
        ListNode before = ans;
        /* 始终指向k个的后一个 */
        ListNode after = null;
        /* 每次取出k个 */
        ListNode[] kListNode = new ListNode[k];
        boolean flag;
        while (true) {
            /*
             * 其实一定会触发异常跳出循环，但是编译器不给过，就加个可以跳出循环的flag，这个flag完全无用
             * */
            flag = false;
            for (int i = 0; i < k; i++) {
                if (i == 0) {
                    kListNode[i] = before.next;
                } else {
                    try {
                        kListNode[i] = kListNode[i - 1].next;
                    } catch (NullPointerException e) {
                        break;
                    }
                    kListNode[i] = kListNode[i - 1].next;
                    if (i == k - 1) {
                        try {
                            after = kListNode[i].next;
                            flag = true;
                        } catch (NullPointerException e) {
                            break;
                        }
                    }
                }
            }
            if (!flag) {
                break;
            }
            for (int i = k - 1; i >= 0; i--) {
                if (i == k - 1) {
                    before.next = kListNode[i];
                } else {
                    kListNode[i + 1].next = kListNode[i];
                    if (i == 0) {
                        kListNode[0].next = after;
                    }
                }
            }
            before = kListNode[0];
        }
        return ans.next;
    }
}
