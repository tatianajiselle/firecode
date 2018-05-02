// java.util.* and java.util.streams.* have been imported for this problem.
// You don't need any other imports.

public static int[] selectionSortArray(int[] arr){
    
    for(int i=0;i<arr.length-1;i++){
        int minElem = i;
        for(int j=i+1;j<arr.length;j++){
            if(arr[minElem] > arr[j]){
                minElem = j;
            }
        }
        int tmp = arr[i];
        arr[i] = arr[minElem];
        arr[minElem] = tmp;
    }
    return arr;
}