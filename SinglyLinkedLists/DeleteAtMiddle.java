public ListNode deleteAtMiddle(ListNode head, int position) {
    ListNode temp = head;
    
    if(head == null){
        return null;
    }
        
    if(position == 1){
        return temp.next;
    }    
    
    while(position-1 > 1){
        temp = temp.next;
        position--;
    }    
    
    if(temp != null){
       temp.next=temp.next.next; 
    }
    
    return head;
}