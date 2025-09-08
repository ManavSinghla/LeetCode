/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        ListNode slow=headA;
        ListNode fast=headB;
        int f1=0;
        int f2=0;
        if(headA== null || headB==null){
            return null;
        }
        else if(slow == fast.next){
            return slow;
        }
        else if(slow.next==fast){
            return fast;
        }
        while(slow!=fast){
            if(slow==null && f1==0){
                slow=headB;
                f1=1;
            }
            else if(fast==null && f2==0){
                fast=headA;
                f2=1;
            }
            slow=slow.next;
            fast=fast.next;
        }
        if(slow ==fast){
            return slow;
        }
        return null;
    }
}