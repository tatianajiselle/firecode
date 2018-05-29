/* Return an array that contains the sorted values from the input array with duplicates removed.


sort([]) → []
sort([1]) → [1]
sort([1, 1]) → [1]*/

int[] sort(int[] input) {
    int j = 0;
    int i = 1;
    
    //return if the array length is less than 2
    if(input.length < 2){
        return input;
    }
    while(i < input.length){
        if(input[i] == input[j]){
            i++;
        }else{
            input[++j] = input[i++];
        }    
    }
    int[] output = new int[j+1];
    for(int k=0; k<output.length; k++){
        output[k] = input[k];
    }
     
    return output;
}
