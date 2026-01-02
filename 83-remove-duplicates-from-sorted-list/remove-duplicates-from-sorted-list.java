class Solution {
    public ListNode deleteDuplicates(ListNode head) {
        int len = 0;
        ListNode temp1 = head;
        while(temp1 != null && temp1.next != null){
         if(temp1.val==temp1.next.val){
                temp1.next = temp1.next.next;
         }else{
            temp1 = temp1.next;
         }
        }
                return head;
    }
}