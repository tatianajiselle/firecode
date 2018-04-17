// run time is o(n)
// space is o(1)


public ListNode insertAtTail(ListNode head, int data) {
    
    ListNode newNode = new ListNode(data); 
    ListNode temp = head;
    
    if (head == null){
        head = newNode;
    } else {
        while (temp.next != null){
            temp = temp.next;
        }
         temp.next = newNode;
    }
    return head;
}