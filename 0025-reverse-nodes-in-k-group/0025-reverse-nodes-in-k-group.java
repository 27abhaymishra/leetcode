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
    public ListNode reverseKGroup(ListNode head, int k) {
        if(head == null || head.next == null) return head;
        ListNode dummy = new ListNode(-1);
        dummy.next = head;
        ListNode prev = dummy , curr = dummy , Next = dummy;
        int count = 0;
        while(curr.next != null){
            curr = curr.next;
            count++;
        }
        while(count >= k){
            curr = prev.next;
            Next = curr.next;
            for(int i = 1; i<k; i++){
                curr.next = Next.next;
                Next.next = prev.next;
                prev.next = Next;
                Next = curr.next;
            }
            prev = curr;
            count -= k;
        }
        return dummy.next;
    }
}