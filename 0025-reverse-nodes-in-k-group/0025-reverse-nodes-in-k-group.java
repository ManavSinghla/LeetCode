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
            ListNode temp = b.next;
            b.next = a;
            a = b;
            b = temp;
        }
        return a;
    }

    public ListNode reverseKGroup(ListNode head, int k) {
        if (head == null || k == 1) return head;
        ListNode start = head;
        ListNode dummy=new ListNode(0);
        dummy.next=head;

        ListNode temp=dummy;
        ListNode end=temp;
        while(true){
            for(int i=0;i<k && end!=null;i++){
                end=end.next;
            }
            if(end==null){
                break;
            }
            ListNode secondStart=end.next;
            end.next=null;
            ListNode slow=reverse(start);
            temp.next = slow;
            temp=start;
            start.next=secondStart;
            end=start;
            start=secondStart;
        }
        return dummy.next;
    }
}