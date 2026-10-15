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
    public ListNode deleteDuplicates(ListNode head) {
        

        // ListNode i = head;
        // ListNode j = head;
        // while(j != null){
        //     if(i.val == j.val){
        //         i.next = j.next;
        //         j = j.next;
                
        //     }
        //     else{
        //         i = j;
        //         j = j.next;
        //     }
        // }
        // return head;

        ListNode curr = head;
        while(curr != null && curr.next != null){
            if(curr.val == curr.next.val){
                curr.next = curr.next.next;
            }
            else{
                curr = curr.next;
            }
        }
        return head;

        
    }
}