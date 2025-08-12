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
        if(head==null || head.next==null){
            return head;
        }
        ListNode ans=head.next;
        ListNode prev=null;
        ListNode curr=head;
        while(curr!=null && curr.next!=null){
            ListNode first=curr;
            ListNode second=curr.next;
            ListNode nextPair=second.next;

            second.next=first;
            first.next=nextPair;

            if(prev!=null){
                prev.next=second;
            }
            prev=first;
            curr=nextPair;

        }
        return ans;
    }
}