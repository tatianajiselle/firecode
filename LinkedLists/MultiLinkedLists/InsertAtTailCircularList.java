// Given a circular linked list, write a method to insert
//  a node at its tail. Return the list's head.


public ListNode insertAtTail(ListNode head, int data) {
    
    if (head == null){
          ListNode newNode = new ListNode(data);
          newNode.next = newNode;
          return newNode;
    }
    
    ListNode newNode = new ListNode(data);
    ListNode temp = head;
    
    while (head.next != temp){
        head = head.next;
    }
    
    head.next = newNode;
    newNode.next = temp;
    
    return temp;
}