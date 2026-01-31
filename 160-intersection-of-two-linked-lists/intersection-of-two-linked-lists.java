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
        ListNode head1 = headA;
        ListNode head2 = headB;
        while(head1!=null){
            head2 = headB;
            while(head2!=null){
                if(head1==head2)return head2;
                head2 = head2.next;
            }head1 = head1.next;
        }
        return null;
    }
}