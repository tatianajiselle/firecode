public ListNode insertAtHead(ListNode head, int data) {

    ListNode newNode = new ListNode(data);
    newNode.next = head;
    head = newNode;
        
    return newNode;
}