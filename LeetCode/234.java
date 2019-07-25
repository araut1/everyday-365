/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {

     static ListNode reverseLL(ListNode head) {

        ListNode p = null;
        ListNode c = head;
        ListNode n = null;

        while (c != null) {

            n = c.next;
            c.next = p;
            p = c;
            c = n;
        }


        return p;
    }


     public boolean isPalindrome(ListNode head) {

        // divide in two parts LL based on ll length is even or odd
        // reverse last list
        // compare
        // if needed join LL again

        if (head == null || head.next == null) {
            return true;
        }

        boolean isP = true;

        ListNode fast = head;
        ListNode slow = head;
        ListNode secondStart = null;
        ListNode mid = null;

        // start of second LL
        while (true) {

            fast = fast.next.next;


            if (fast == null) {
                secondStart = slow.next;
                break;
            }

            if (fast.next == null) {
                secondStart = slow.next.next;
                mid = slow.next;
                mid.next = null;
                break;
            }

            slow = slow.next;

        }

        slow.next = null;

        // reverse second LL
        secondStart = reverseLL(secondStart);

        ListNode first = head;
        ListNode second = secondStart;


        while (first != null || second != null) {

            if (first.val != second.val) {
                return false;
            }
            first = first.next;
            second = second.next;

        }


        return isP;


    }
}
