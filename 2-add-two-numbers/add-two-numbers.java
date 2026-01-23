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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode node = null;
        int carry = 0;
        while(l1!=null || l2!=null || carry!=0){
            int first = (l1!=null)?l1.val:0;
            int sec = (l2!=null)?l2.val:0;
            int sum = first + sec + carry;
            carry = sum / 10;
            sum = sum%10;
            ListNode newnode = new ListNode(sum);
            if(node==null)node = newnode;
            else{
                ListNode temp = node;
                while(temp.next!=null){
                    temp = temp.next;
                }temp.next = newnode;
            }
            if(l1!=null)l1 = l1.next;
            if(l2!=null)l2 = l2.next;
        }
        return node;
    }
}