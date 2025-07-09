
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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode t1 = reverse(l1);
        ListNode t2 = reverse(l2);
         ListNode dummy = new ListNode(-1);
        ListNode temp = dummy;
        int carry = 0;
        while(t1 != null || t2 != null){
            int val1 =0; int val2 =0;
            if(t1!=null) val1 = t1.val;
            if(t2 != null) val2 = t2.val;
            int num = val1 + val2 + carry;
            ListNode node = new ListNode(num % 10);
            temp.next = node;
            temp = temp.next;
            if(num > 9) carry = 1;
            else carry =0;
            if(t1 != null) t1 = t1.next;
            if(t2 != null) t2 = t2.next;
        }
        if(carry == 1){
            ListNode node = new ListNode(1);
            temp.next = node;
            temp = temp.next;
        }
       ListNode ans = reverse(dummy.next);
       return ans;
    }
}