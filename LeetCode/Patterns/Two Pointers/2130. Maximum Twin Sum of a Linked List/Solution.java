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
    public int pairSum(ListNode head) {
        ListNode a = head;
        int count = 0 ;

        while(a != null){
            a = a.next;
            count++;

        }
        int n = count;
        List<Integer> list = new ArrayList<>();
        int j = n-1;
        int sum = 0;
        int maxsum =0;
        while(head!=null){
            list.add(head.val);
            head = head.next;
        }
        
        for(int i = 0 ; i<n/2 ; i++){
            sum =0;

            sum = list.get(i)+list.get(j);
            j--;
            if(maxsum<sum){
                maxsum =sum;
            }

            

        }
        return maxsum;
        
    }
}