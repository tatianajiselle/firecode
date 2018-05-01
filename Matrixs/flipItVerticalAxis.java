// java.util.* and java.util.streams.* have been imported for this problem.
// You don't need any other imports.

// complexity: o(m/2 * n) = o(m*n)
// space: constant 

public static void flipItVerticalAxis(int[][] matrix) {
    for (int i = 0; i <= matrix.length - 1 ; i++){
        for(int j = 0; j <= (matrix[0].length - 1)/2 ; j++){
            int temp = matrix[i][j];
            matrix[i][j] = matrix[i][(matrix[0].length - 1)-j];
            matrix[i][(matrix[0].length - 1) - j] = temp;
        }
    }
}

// ======================= solution overflow ==================== //
public static void flipItVerticalAxis(int[][] matrix) {
    
    for (int i = 0; i < matrix.length; i++) {
        for (int j = 0, q = matrix[i].length - 1; j < q; j++, q--) {
            int temp = matrix[i][j];
            matrix[i][j] = matrix[i][q];
            matrix[i][q] = temp;
        }
    }   
}