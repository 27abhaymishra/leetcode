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
    public ListNode partition(ListNode head, int x) {
        ListNode dummy1 = new ListNode(-23);
        ListNode dummy2 = new ListNode(-21);
        ListNode temp1 = dummy1;
        ListNode temp2 = dummy2;
        ListNode temp3 = head;

        while(temp3 != null){
            if(temp3.val < x){
                temp1.next = temp3;
                temp1 = temp1.next;
            }else{
                temp2.next = temp3;
                temp2 = temp2.next;
            }
            temp3 = temp3.next;
        }
        temp1.next = dummy2.next;
        temp2.next = null;
        return dummy1.next;
    }
}