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
    public ListNode swapPairs(ListNode head) {
        if(head==null || head.next==null) return head;
        ListNode ans=head.next;
        ListNode curr=head;
        ListNode prev=null;
        while(curr!=null && curr.next!=null){
            ListNode next=curr.next;
            ListNode nextPair=next.next;
            next.next=curr;
            curr.next=nextPair;
            if(prev!=null){
                prev.next=next;
            }
            prev=curr;
            curr=nextPair;
        }
        return ans;
    }
}