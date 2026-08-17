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
        // ListNode a = headA;
        // ListNode b = headB;
        // while(a != b ){
        //     if(a==null){
        //         a = headB;
        //     }
        //     else{
        //         a=a.next;
        //     }
        //     if(b==null){
        //         b = headA;
        //     }
        //     else{
        //         b = b.next;
        //     }
        // }
        // return a ;


        //-----approch 2------
        
        int a = 0 ;
        int b = 0;
        ListNode tempA = headA;
        ListNode tempB = headB;
        int difference = 0 ;
        while(tempA != null){
            tempA = tempA.next;
            a++;
        }
        while(tempB != null){
            tempB = tempB.next;
            b++;
        }
        if(a>b){
            difference = a-b;
        }
        else{
            difference = b-a;
        }
        ListNode fast;
        ListNode slow;
        if(a>b){
            fast = headA;
            slow = headB;
        }
        else{
            fast = headB;
            slow = headA;
        }
       
        for(int i = 0; i<difference ; i++){
            fast = fast.next;
            

        }

        while(fast != null && slow != null){
            if(slow == fast){
                return slow;
            }
            fast = fast.next;
            slow = slow.next;


        }
        return null;

       
        
        
    }
}