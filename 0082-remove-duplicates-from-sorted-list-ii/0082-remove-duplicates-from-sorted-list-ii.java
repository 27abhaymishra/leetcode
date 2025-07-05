/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode deleteDuplicates(ListNode head) {
        if (head == null) return null;

        ListNode dummy = new ListNode(0);  // Dummy node before head
        dummy.next = head;

        ListNode prev = dummy;    // The last node before the current distinct sequence
        ListNode current = head;

        while (current != null) {
            // Move current until the end of duplicates
            while (current.next != null && current.val == current.next.val) {
                current = current.next; // Skip duplicates
            }

            // If prev.next is current, no duplicates encountered
            // Otherwise, duplicates were detected, skip them all
            if (prev.next == current) {
                prev = prev.next; // Move prev forward only if no duplicates
            } else {
                prev.next = current.next; // Skip all duplicates
            }

            current = current.next;
        }

        return dummy.next;
    }
}