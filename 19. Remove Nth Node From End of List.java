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
    public ListNode reverseList(ListNode current){
        if(current == null){
            return current;
        }
        ListNode prev = null;
        ListNode curr1 = current;
        ListNode next = null;
        while(curr1!=null){
            next = curr1.next;
            curr1.next = prev;
            prev = curr1;
            curr1 = next;
        }
        return prev;
    }
    public ListNode removeNthFromEnd(ListNode head, int n) {
        int count = 1;
            ListNode reverse_list = reverseList(head);
      /*  while(reverse_list!=null){
            
            System.out.println(reverse_list.val+"");
            reverse_list = reverse_list.next;
        }*/
       // ListNode dummy = new ListNode(0);
         //dummy.next =  reverse_list;
        ListNode curr3 = reverse_list;
       // System.out.println(curr3.val+",");
        if(n!=1){
             while(count!=n-1){
            System.out.println(curr3.val);
            curr3 = curr3.next;
            count++;
         // System.out.println(curr3.val+"");
        }
        } 
             curr3.next = curr3.next.next;
        
           
        
        
        
       //if(count == n){
         //   curr3.next = curr3.next.next;
        //}
        /* while(reverse_list!=null){
            
            System.out.println(reverse_list.val+"");
            reverse_list = reverse_list.next;
        }*/
       ListNode answer_list = reverseList(reverse_list);
        
        return answer_list;
    }
}
