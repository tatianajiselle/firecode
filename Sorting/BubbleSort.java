// solved in 4 minutes
// o(n^2) --> really bad run time for a sort

public static int[] bubbleSortArray(int[] arr){
    for (int i = 0; i < arr.length; i++){
        for (int j = 0; j < arr.length-1; j++){
            if (arr[j] > arr[j+1]){
                int temp = arr[j];
                arr[j]=arr[j+1];
                arr[j+1] = temp;
            }
        }
    }
    return arr;
}