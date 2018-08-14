public static int[] rotateLeft(int[] arr, int k)  {	
	if (arr == null) return null;
    int actualShifts = k % arr.length;
    reverse(arr, 0, arr.length-1);
    reverse(arr, 0, arr.length - actualShifts-1);
    reverse(arr, arr.length - actualShifts, arr.length-1);
    return arr;
}
 
public static void reverse(int[] arr, int left, int right){
	if(arr == null || arr.length == 1) return;
	while(left < right){
		int temp = arr[left];
		arr[left] = arr[right];
		arr[right] = temp;
		left++;
		right--;
	}	
}


// === SOLUTION OVERFLOW === //
public static int[] rotateLeft(int[] arr, int k) {
    if (arr == null) {
        return null;
    }
    
    int places = k % arr.length;
    
    int curr = arr.length-1;
    int next = 0;
    int prev = arr[curr];
    
    do {
        int target = curr - places;
        
        // If next item to rotate is below 0, start from the end of the array
        if (target < 0) {
            target += arr.length;
        }
        
        next = arr[target];
        arr[target] = prev;
        curr = target;
        prev = next;
    } while (curr != arr.length-1);
    
    return arr;
}