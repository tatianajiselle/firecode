public DoublyLinkedNode deleteAtPos(DoublyLinkedNode head, int pos) {
    if (head == null)
        return null;
    else if (head.next == null)
        return (pos == 1)? null : head;
    else {
        int count = 1;
        DoublyLinkedNode curr = head;
        DoublyLinkedNode prev = null;
        while (curr != null) {
            if (count == pos)
                break;
            count++;
            prev = curr;
            curr = curr.next;
        }
        // Invalid position
        if (count < pos)
            return head;
        // Tail position
        else if (curr.next == null) {
            prev.next = null;
            curr.prev = null;
            return head;
        }
        // Head position
        else if (count == 1) {
            DoublyLinkedNode temp = curr;
            curr.next.prev = null;
            curr = curr.next;
            temp.next = null;
            return curr;
        }
        // Middle position
        else {
            prev.next = curr.next;
            curr.prev = null;
            curr.next.prev = prev;
            curr.next = null;
            return head;
        }
    }
}