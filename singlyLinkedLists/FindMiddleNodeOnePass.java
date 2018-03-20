// java.util.* and java.util.streams.* have been imported for this problem.
// You don't need any other imports.
// complexity is constant o(n)

public ListNode findMiddleNode(ListNode head) {
    // use two pointers to keep track of the list. move the second point 2x the first pointer
    // until the second pointer hits null.
    
    // base case -- assuming node can be null
    if (head == null){
        return null;
    }
    
    // edge cases
    if (head.next == null || head.next.next == null){
        return head;
    }
        
    ListNode head2 = head;
    
    while (head2 != null){
        head = head.next;
        head2 = head.next.next.next;
        
    }
    return head;
}