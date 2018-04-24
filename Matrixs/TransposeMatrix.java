public static void transposeMatrix(int[][] matrix) {

    for(int i = 0; i < matrix.length-1; i++){
        for(int j = i+1; j <= matrix.length-1; j++){
            int temp = matrix[i][j];
            matrix[i][j] = matrix[j][i];
            matrix[j][i] = temp;
        }
    }
}