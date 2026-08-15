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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        // int k = 0 ;
        // ListNode temp = new ListNode();
        // temp = head;
        // while(temp!=null){
        //     temp = temp.next;
        //     k++;
        // }
        // temp = head;
        // for(int i = 0 ; i<k-n;i++){
        //     temp = temp.next;
            
        // }
        // temp = temp.next.next;
        // return head;


        // -------1st approch-----
        //  int k = 0;
        // ListNode temp = head;
        // while (temp != null) {
        //     temp = temp.next;
        //     k++;
        // }
        // if (k == n) {
        //     return head.next;
        // }
        // temp = head;
        // for (int i = 0; i < k - n - 1; i++) {
        //     temp = temp.next;
        // }
        // temp.next = temp.next.next;
        // return head;


        // ------2nd approch------

        // ListNode slow = head;
        // ListNode fast = head;
        // for(int i = 0 ; i<n-1 ; i++){
        //     fast = fast.next;
        // }
        // if (fast == null) {
        //     return head.next;
        // }
        // while(fast.next!=null){
            
        //     fast = fast.next;
        //     slow = slow.next;
        // }
        // slow.next = slow.next.next;
        // return head;
        ListNode slow = head;
        ListNode fast = head;
        for (int i = 0; i < n; i++) {
            fast = fast.next;
        }
        if (fast == null) {
            return head.next;
        }
        while (fast.next != null) {
            fast = fast.next;
            slow = slow.next;
        }
        slow.next = slow.next.next;
        return head;
    }
}