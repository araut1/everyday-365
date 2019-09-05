/*
Detect a cycle in a linked list. Note that the head pointer may be 'null' if the list is empty.

A Node is defined as: 
    class Node {
        int data;
        Node next;
    }
*/

boolean hasCycle(Node head) {
      Node cur = head;
       
       Set<Node> set = new HashSet<>();

       while( cur !=null){
           
           if(set.contains(cur)){
               return true;
           } else {
            set.add(cur);   
           }
           cur = cur.next;
       }

       return false;
}
