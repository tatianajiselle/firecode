// java.util.* and java.util.streams.* have been imported for this problem.
// You don't need any other imports.
// complexity: o(m/2 * n) = o(m*n)
// space: constant 


public static void flipHorizontalAxis(int[][] matrix) {
    int temp = 0;
    
    for (int r = 0; r <= (matrix.length - 1)/2; r++){
        for (int c = 0 ; c <= (matrix[0].length - 1); c++){
            temp = matrix[r][c];
            matrix[r][c] = matrix[(matrix.length - 1) - r][c];
            matrix[(matrix.length - 1) - r][c] = temp;
        }
    }
}


// UPDATEDD SOLUTION
// swaps in place

if(matrix.length > 1) {
    for(int i = 0; i < matrix.length / 2; i++) {
        int[] temp = matrix[i];
        matrix[i] = matrix[matrix.length - 1 - i];
        matrix[matrix.length - 1 - i] = temp;
    }
}