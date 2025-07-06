
class Solution {
    public ListNode swapPairs(ListNode head) {
           // Dummy node to simplify edge cases
        ListNode dummy = new ListNode(0);
        dummy.next = head;

        // Pointer to track the node before the pair
        ListNode current = dummy;

        // Traverse the list while there are at least two more nodes
        while (current.next != null && current.next.next != null) {
            // Nodes to be swapped
            ListNode first = current.next;
            ListNode second = current.next.next;

            // Swapping
            first.next = second.next;
            second.next = first;
            current.next = second;

            // Move current pointer forward by two nodes
            current = first;
        }

        return dummy.next;
    }
}