
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
    public int pairSum(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;
        while(fast != null){
            slow = slow.next;
            fast = fast.next.next;
        }
        ListNode j = reverse(slow);
        ListNode i = head;
        int sum = 0;
        while(j != null){
            int currSum = j.val + i.val;
            if(sum < currSum){
                sum = currSum;
            }
            i = i.next;
            j = j.next;
        }
        return sum;

    }
}