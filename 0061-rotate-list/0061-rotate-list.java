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
    public ListNode rotateRight(ListNode head, int k) {
        ListNode slow=head;
        ListNode fast=head;
        ListNode temp1=head;
        int c=0;
        while(temp1!=null){
            c++;
            temp1=temp1.next;
        }
        if(k==0 || c==0){
            return head;
        }
        for(int i=0;i<k%c;i++){
            fast=fast.next;
        }
        while(fast.next!=null){
            slow=slow.next;
            fast=fast.next;
        }
        fast.next=head;
        ListNode temp=slow.next;
        slow.next=null;
        head=temp;
        return head;
    }
}