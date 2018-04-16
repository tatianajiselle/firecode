Node Nth_Node_From_End(head, n){

    // base case! The list is empty!
    if(head == null){
        return null;
    }
    
    int length = 0;
    Node temp = head; // save value of head
    
    // this loop breaks at the end of the linked list
    while(head != null){
        head = head.next;
        length++; // increment counter to keep track of length
    }
    head = temp; // reset head back to its proper position
    
    // iterate through the list starting @head (temp) until length-n
    for(int i=0; i <= (length-n); i++){
        head = head.next;
    }
    return head; // head now contains the nth node from the end!
}