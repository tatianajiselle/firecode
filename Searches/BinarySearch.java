// complexity o(log N) .. space o(1)

public static Boolean binarySearch(int[] arr, int n){
    int low = 0;
    int high = arr.length - 1;
   
    while (low <= high){
        
        int mid = low + (high - low)/2;
        
        if (arr[mid] < n){
            low = mid + 1;
        } else if (arr[mid] > n){
            high = mid - 1;   
        }
        else {
            return true;
        }
    }
    return false;
}

// RECURSIVE BINARY SEARCH

public static Boolean binarySearch(int[] arr, int n){
    return binarySearch(arr,n,0,arr.length-1);
}

public static Boolean binarySearch(int[] arr, int n, int low, int high){
    
    if (low > high){
        return false;
    }
    int med = (low + high) / 2;
    if(arr[med] == n) {
        return true;
    } else { 
        if(arr[med] < n) {
            return binarySearch(arr,n,med + 1, high);
        } else {
            return binarySearch(arr,n,low, med - 1);
        }
    }
}