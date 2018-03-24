// o(n)

public ListNode deleteAtTail(ListNode head) {
        
    if (head == null){
        return null;
    }
    
    if (head.next == null){
        return null;
    }
    
    ListNode temp = head;
    while (head.next.next != null){
        head = head.next;
       
    }
    
    head.next = null;
    return temp;
    
}