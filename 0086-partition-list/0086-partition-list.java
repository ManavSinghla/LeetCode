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
    public ListNode partition(ListNode head, int x) {
        ListNode temp1=new ListNode(0);
        ListNode temp2=new ListNode(0);
        ListNode less=temp1;
        ListNode more=temp2;
        while(head!=null){
            if(head.val<x){
                less.next=head;
                less=less.next;
            }
            else{
                more.next=head;
                more=more.next;
            }
            head=head.next;
        }
        more.next=null;
        temp2=temp2.next;
        less.next=temp2;
        return temp1.next;
    }
}