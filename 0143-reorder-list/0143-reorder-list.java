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
    ListNode reverse(ListNode head) {
        ListNode a = head;
        ListNode b = head.next;
        a.next = null;
        while (b != null) {
            ListNode temp1 = b.next;
            b.next = a;
            a = b;
            b = temp1;
        }
        return a;
    }

    public void reorderList(ListNode head) {
        if (head.next == null || head.next.next == null) {
            return;
        }

        ListNode slow = head;
        ListNode fast = head;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        ListNode second=reverse(slow.next);
        slow.next=null;

        ListNode first=head;
        while(second!=null){
            ListNode temp1=first.next;
            ListNode temp2=second.next;

            first.next=second;
            second.next=temp1;

            first=temp1;
            second=temp2;
        }

    }
}