class Solution {
    public ListNode reverseKGroup(ListNode head, int k) {

        ListNode dummy = new ListNode(0);
        dummy.next = head;

        ListNode before = dummy;

        while (true) {

            // Check if k nodes exist
            ListNode temp = before;

            for (int i = 0; i < k; i++) {
                temp = temp.next;

                if (temp == null) {
                    return dummy.next;
                }
            }

            // Reverse k nodes
            ListNode t = before.next;   // original first node
            ListNode cur = t;
            ListNode prev = null;

            for (int i = 0; i < k; i++) {
                ListNode next = cur.next;
                cur.next = prev;
                prev = cur;
                cur = next;
            }

            // Connect
            before.next = prev;
            t.next = cur;

            // Move before to end of reversed group
            before = t;
        }
    }
}