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
    public ListNode reverseList(ListNode head) {
        ListNode newHead;
            
       // System.out.println(hea)
       if(head.next==null){
           newHead=head;
           return head;
       }
    
        ListNode nextNode=reverseList(head.next);
        nextNode.next=head;
        return head;
        
    }
}

