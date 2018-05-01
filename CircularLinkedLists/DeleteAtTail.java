// java.util.* and java.util.streams.* have been imported for this problem.
// You don't need any other imports.

public ListNode deleteAtTail(ListNode head) {
    
    ListNode p1 = head.next;
    ListNode p2 = head;

    while(p1.next != head){
        p1 = p1.next;
        p2 = p2.next;
    }
    p2.next = head;
    
    return head;
}