public static int[] merge(int[] arrLeft, int[] arrRight){
    int lenLeft = arrLeft.length;
    int lenRight = arrRight.length;
    
    int[] arrMerged = new int[lenLeft+lenRight];
    
    // Maintain 3 indices left array/right/merged array
    int indLeft = 0, indRight = 0, indMerged = 0;
    
    // While neither array is empty, run a while loop to merge
    // the smaller of the two elements, starting at the leftmost position of 
    // both arrays
    while(indLeft < lenLeft && indRight < lenRight){
        if(arrLeft[indLeft] < arrRight[indRight])
            arrMerged[indMerged++] = arrLeft[indLeft++];
        else
            arrMerged[indMerged++] = arrRight[indRight++];
    }
    
    // Another while loop for when the left array still has elements left
    while(indLeft < lenLeft){
        arrMerged[indMerged++] = arrLeft[indLeft++];
    }
    
    // Another while loop for when the right array still has elements left
    while(indRight < lenRight){
        arrMerged[indMerged++] = arrRight[indRight++];
    }
    
    return arrMerged;
}

//========================= solution overflow ============================//
// java.util.* has been imported for this problem.
// You don't need any other imports.

public static int[] merge(int[] arrLeft, int[] arrRight){
    int[] ret = new int[arrLeft.length + arrRight.length];
    int i, j, k;
    i = j = k = 0;
    
    while (i < arrLeft.length && j < arrRight.length)
        ret[k++] = arrLeft[i] < arrRight[j] ? arrLeft[i++] : arrRight[j++];

    while (i < arrLeft.length)
        ret[k++] = arrLeft[i++];
    
    while (j < arrRight.length)
        ret[k++] = arrRight[j++];
    
    return ret;
}