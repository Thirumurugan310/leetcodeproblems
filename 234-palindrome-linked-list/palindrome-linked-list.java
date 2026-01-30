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
    public boolean isPalindrome(ListNode head) {
        if(head.next==null || head == null)return true;
        ListNode fast = head;
        ListNode slow = head;
        while(fast.next!=null && fast.next.next!=null){
            fast = fast.next.next;
            slow = slow.next;
        }
        ListNode curr = slow.next;
        slow.next = null;
        ListNode pre = null;
        ListNode nex = null;
        while(curr!=null){
            nex = curr.next;
            curr.next = pre;
            pre = curr;
            curr = nex; 
        }curr = pre;
        ListNode temp = head;
        boolean flag = true;
        while(curr!=null){
            if(temp.val!=curr.val){
                flag = false;
                break;
            }temp = temp.next;
            curr = curr.next;
        }
        return flag==true;
    }
}