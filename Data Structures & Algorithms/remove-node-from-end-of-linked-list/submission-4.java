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
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        ListNode right = head;
        int r = 0;
        ListNode left = dummy;

        while(right != null){
            right = right.next;
            r++;
            if(r > n){
                left = left.next;
            }
        }

        left.next = left.next.next;
        return dummy.next;
    }
}
