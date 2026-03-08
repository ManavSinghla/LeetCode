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
    ListNode reverse(ListNode head){
        if(head==null || head.next==null) return head;
        ListNode a=head;
        ListNode b=head.next;
        a.next=null;
        while(b!=null){
            ListNode temp=b.next;
            b.next=a;
            a=b;
            b=temp;
        }
        return a;
    }
    public boolean isPalindrome(ListNode head) {
        if(head==null || head.next==null) return true;
        ListNode slow=head;
        ListNode fast=head;
        ListNode curr=head;
        ListNode prev=null;
        while(fast!=null && fast.next!=null){
            fast=fast.next.next;
            prev=slow;
            slow=slow.next;
        }
        if(fast!=null) slow=slow.next;
        prev.next=null;
        slow=reverse(slow);
        while(slow!=null){
            if(slow.val!=curr.val) return false;
            slow=slow.next;
            curr=curr.next;
        }
        return true;
    }
}