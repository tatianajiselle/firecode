public static int largest ( int[] input ) {
    int max = Integer.MIN_VALUE;
    for ( int i = 0; i < input.length; i++ ) {
        if ( input[i] > max ) max = input[i];
        }
        return max;
    }