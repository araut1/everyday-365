/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        
        
        
        
        
        
        
        if (l1 == null) {
            return l2;
        }
        if (l2 == null) {
            return l1;
        }

        ListNode i = l1;
        ListNode j = l2;
        ListNode dummy = new ListNode(-1);
        ListNode prev = dummy;


        while (i != null && j != null) {

            if (i.val <= j.val) {
                prev.next = i;
                i = i.next;
                prev = prev.next;
            } else {
                prev.next = j;
                j = j.next;
                prev = prev.next;
            }


        }

        if (i == null) {
            prev.next = j;
        }
        if (j == null) {
            prev.next = i;
        }


        return dummy.next;

        
        
    }
}
