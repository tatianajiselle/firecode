// this algorithm can be expanded for more numbers.
// if ten is a real number in an inclusive set, we can use
// n! to sum the range of the numbers and subract that from the sum of 
// the array
// runtime is o(N)

public static int findMissingNumber(int[] arr) {
    int sum = 0;
    
    for (int i : arr){
        sum += i;
    }
    
    return 55 - sum; 
}
