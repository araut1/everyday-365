public class ListNode {
    int val;
    ListNode next;

    ListNode(int x) {
        val = x;
    }


    static public ListNode createList(int[] a) {

        ListNode head = new ListNode(a[a.length - 1]);


        for (int i = a.length - 2; i >= 0; i--) {

            ListNode node = new ListNode(a[i]);

            node.next = head;
            head = node;
        }

        return head;
    }


    static public ListNode reverse(ListNode head) {

        if (head == null || head.next == null) {
            return head;
        }

        ListNode temp = reverse(head.next);
        head.next.next = head;
        head.next = null;


        return temp;
    }

//    public static ListNode reverseLL(ListNode head) {
//
//        ListNode p = null;
//        ListNode c = head;
//        ListNode n = null;
//
//        while (c != null) {
//
//            n = c.next;
//            c.next = p;
//            p = c;
//            c = n;
//        }
//        return p;
//    }

    public void printList() {
        ListNode cur = this;
        while (cur != null) {
            System.out.print(cur.val + " ");
            cur = cur.next;
        }
    }


}
