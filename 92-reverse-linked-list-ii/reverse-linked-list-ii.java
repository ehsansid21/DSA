/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) {
 *         this.val = val;
 *         this.next = next;
 *     }
 * }
 */
class Solution {
    public ListNode reverseBetween(ListNode head, int left, int right) {

        if (head == null || left == right) {
            return head;
        }

        ListNode dummy = new ListNode(0);
        dummy.next = head;

        // before = node before the left position
        ListNode before = dummy;
        for (int i = 1; i < left; i++) {
            before = before.next;
        }

        // cur = first node of the sublist to reverse
        ListNode cur = before.next;

        // t will become the tail of the reversed sublist
        ListNode t = cur;

        ListNode prev = null;

        // Reverse exactly (right - left + 1) nodes
        for (int i = 0; i <= right - left; i++) {
            ListNode next = cur.next;

            cur.next = prev;
            prev = cur;
            cur = next;
        }

        // Reconnect the reversed part
        t.next = cur;        // tail → remaining list
        before.next = prev; // before → new head of reversed part

        return dummy.next;
    }
}