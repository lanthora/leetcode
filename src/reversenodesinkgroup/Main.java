package reversenodesinkgroup;

import datastructure.ListNode;

public class Main {
    public static void main(String[] args) {
        ListNode listNode = new ListNode(new int[]{1, 2, 3});
        Solution solution = new Solution();
        ListNode ans = solution.reverseKGroup(listNode, 3);
        ans.show();
    }
}
