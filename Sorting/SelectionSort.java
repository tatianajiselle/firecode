public static int[] selectionSortArray(int[] arr){
    // Maintain a head pointer, starting at index 0. This pointer will be 
    // incremented right in an outer for loop. Everything to the left of this
    // pointer is already sorted. 

    int head;
    int tail;

    // Outer for loop iterates head from 0 to arr.length - 1
    for(head=0;head<arr.length-1;head++){

        // A tail pointer, initialized as head+1, moves right inside an inner for loop
        for(tail = head+1;tail < arr.length;tail++){
            
            // if arr[tail] is < arr[head], swap them
            if(arr[tail] < arr[head]){
                int temp = arr[head];
                arr[head] = arr[tail];
                arr[tail] = temp;
            }
        }
    }
    return arr;
}