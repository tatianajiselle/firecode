// java.util.* and java.util.streams.* have been imported for this problem.
// You don't need any other imports.

public Boolean isListEven(ListNode head) {
    int count = 0;
    
    if (head == null) return true;
    
    while (head.next != null){
        head = head.next;
        count += 1;
    }
    
    if (count%2 == 0){
       return false;
    }
    return true;
}