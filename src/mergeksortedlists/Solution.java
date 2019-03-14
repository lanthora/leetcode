package mergeksortedlists;

import datastructure.ListNode;


public class Solution {
    public ListNode mergeKLists(ListNode[] lists) {
        ListNode ans = new ListNode(0);
        ListNode current = ans;
        /* table初始值 */
        int[] table = new int[lists.length];
        for (int i = 0; i < lists.length; i++) {
            if (lists[i] != null)
                table[i] = lists[i].val;
            else
                table[i] = Integer.MAX_VALUE;
        }

        int pos;
        while (true && table.length > 0) {
            /* 取出最小的索引 */
            pos = getMinIndex(table);
            if (table[pos] == Integer.MAX_VALUE) {
                break;
            }
            /* 把最小值存到结果链表 */
            current.next = new ListNode(table[pos]);

            current = current.next;
            lists[pos] = lists[pos].next;
            try {
                table[pos] = lists[pos].val;
            } catch (NullPointerException e) {
                table[pos] = Integer.MAX_VALUE;
            }
        }
        return ans.next;

    }

    public static int getMinIndex(int[] arr) {
        int minIndex = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < arr[minIndex]) {
                minIndex = i;
            }
        }
        return minIndex;
    }

}
