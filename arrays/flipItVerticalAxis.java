// java.util.* and java.util.streams.* have been imported for this problem.
// You don't need any other imports.

public static void flipItVerticalAxis(int[][] matrix) {
    for (int i = 0; i <= matrix.length - 1 ; i++){
        for(int j = 0; j <= (matrix[0].length - 1)/2 ; j++){
            int temp = matrix[i][j];
            matrix[i][j] = matrix[i][(matrix[0].length - 1)-j];
            matrix[i][(matrix[0].length - 1) - j] = temp;
        }
    }
}