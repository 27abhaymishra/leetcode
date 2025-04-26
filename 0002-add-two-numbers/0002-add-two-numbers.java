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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode ans = new ListNode(0);
        int carry = 0;
        ListNode last = ans;

        while(l1 != null && l2 != null){
            int sum = l1.val + l2.val + carry;
            last.next = new ListNode(sum % 10);
            carry = sum / 10;
            l1 = l1.next;
            l2 = l2.next;
            last = last.next;
        }

        while( l1 != null){
            int sum = l1.val + carry;
            last.next = new ListNode(sum % 10);
            carry = sum / 10;
            l1 = l1.next;
            last = last.next;
        } while( l2 != null){
            int sum = l2.val + carry;
            last.next = new ListNode(sum % 10);
            carry = sum / 10;
            l2 = l2.next;
            last = last.next;
        }
        if(carry > 0){
            last.next = new ListNode(carry);
        }
        return ans.next;
    }
}