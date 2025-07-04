
class Solution {
    public ListNode reverse(ListNode head){
        ListNode prev = null;
        ListNode curr = head;
        ListNode Next = head;

        while(curr != null){
            Next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = Next;
        }
        return prev;
    }
    public boolean isPalindrome(ListNode head) {
        if(head.next == null) return true;
        ListNode newhead = new ListNode(head.val);
        ListNode t1 = head.next;
        ListNode t2 = newhead;
        while(t1 != null){
            ListNode temp = new ListNode(t1.val);
            t2.next = temp;
            t2 = t2.next;
            t1 = t1.next;
        }
        newhead = reverse(newhead);
        t1 = head;
        t2 = newhead;
        while(t1 != null){
            if(t1.val != t2.val) return false;
            else{
                t1 = t1.next;
                t2 = t2.next;
            } 
        }
        return true;
    }
}