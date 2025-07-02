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
    public ListNode rotateRight(ListNode head, int k) {
        if(head == null || head.next == null)  return head;
        int n = 0;
       ListNode temp = head;
       while(temp != null){
        temp = temp.next;
        n++;
       }
       k = k % n;
       if(k == 0) return head;
       ListNode slow = head;
       ListNode fast = head;
      for(int i =1; i<=k; i++){
        fast = fast.next;
      }
      while(fast.next != null){
        fast = fast.next;
        slow = slow.next;
      }
      ListNode newhead = slow.next;
      slow.next = null;
      fast.next = head;
      return newhead;
    }
}