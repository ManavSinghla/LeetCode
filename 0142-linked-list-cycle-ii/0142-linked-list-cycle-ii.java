/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode detectCycle(ListNode head) {
        ListNode slow=head;
        ListNode fast=head;
        int f=0;
        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
            if(slow == fast){
                f=1;
                break;
            }
        }
        ListNode temp=head;
        if(f==0){
            return null;
        }
        while(temp!=slow){
            temp=temp.next;
            slow=slow.next;
        }
        return slow;
    }
}