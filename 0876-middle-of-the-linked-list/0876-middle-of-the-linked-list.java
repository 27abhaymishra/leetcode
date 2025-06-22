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
    public ListNode middleNode(ListNode head) {
        ListNode temp = head;
        int leng = 0;
        while(temp != null){
            temp = temp.next;
            leng++;
        }
        int mid = (leng/2 + 1);
        temp = head;
        for(int i = 1; i<=mid-1; i++){
            temp = temp.next;
        }
        return temp;
    }
}