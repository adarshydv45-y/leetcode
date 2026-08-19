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
    public ListNode swapNodes(ListNode head, int k) {
        // ListNode t1 = head ;
        // ListNode t2 = head;
        // int n = 0;
        // while(t1 != null){
        //     t1 = t1.next;
        //     n++;
        // }
        // t1 = head;
        // for(int i = 0 ; i<n-k ; i++){
        //     t1 = t1.next;
        // }
        // for(int j = 0 ; j<k-1 ; j++){
        //     t2 = t2.next;
        // }
        // int temp = t1.val;
        // t1.val = t2.val;
        // t2.val = temp;

        // return head;





        // ------Approach 2 -------
        ListNode fast  = head;
        ListNode slow = head ;
        for(int i = 1 ; i<= k ; i++){
            fast = fast.next;
        }
        while(fast != null){
            slow = slow.next;
            fast= fast.next;
        }
        fast = head;
        for(int i = 1 ; i<=k-1 ; i++){
            fast = fast.next ;
        }
        int temp = fast.val ;
        fast.val = slow.val;
        slow.val = temp;
        return head;
        
        
    }
}