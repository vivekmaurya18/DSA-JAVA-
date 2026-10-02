
/*

===================================>Brute Approach<=======================================

class Solution {

    public static void setZeroes(int[][] matrix) {

        int n = matrix.length;
        int m = matrix[0].length;

        // Step 1: Find 0
        for (int i = 0; i < n; i++) {

            for (int j = 0; j < m; j++) {

                if (matrix[i][j] == 0) {

                    // Mark row
                    for (int k = 0; k < m; k++) {
                        if (matrix[i][k] != 0) {
                            matrix[i][k] = -1;
                        }
                    }

                    // Mark column
                    for (int k = 0; k < n; k++) {
                        if (matrix[k][j] != 0) {
                            matrix[k][j] = -1;
                        }
                    }
                }
            }
        }

        // Step 2: Convert -1 to 0
        for (int i = 0; i < n; i++) {

            for (int j = 0; j < m; j++) {

                if (matrix[i][j] == -1) {
                    matrix[i][j] = 0;
                }
            }
        }
    }
}






// ================================>Better Approach<======================================


public class setMatrixZeros {

    public static int[][] setMatrixZeros(int[][] matrix) {

        int n = matrix.length;
        int m = matrix[0].length;

        int[] marksRow = new int[n];
        int[] marksCol = new int[m];

        // Step 1: Find zeros
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {

                if (matrix[i][j] == 0) {
                    marksRow[i] = 1;
                    marksCol[j] = 1;
                }
            }
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if(marksRow[i]==1|| marksCol[j]==1){
                    matrix[i][j]=0;
                }
                
            }
            
        }

        return matrix;
    }
    public static void main(String[] args) {
        int[][] matrix={
            {1,1,1,1},
            {1,0,1,1},
            {1,1,0,1},
            {1,0,0,1}
        };
        int[][] result=setMatrixZeros(matrix);
        
        for (int i = 0; i < result.length; i++) {
            for (int j = 0; j < result[i].length; j++) {
                System.out.print(result[i][j] + " ");
            }
            System.out.println();
        }
    }
}
*/

// =============================>Optimal Approach<==========================================

class Solution {
    public void setZeroes(int[][] matrix) {

        int m = matrix.length;
        int n = matrix[0].length;

        boolean firstRow = false;
        boolean firstCol = false;

        // Check first row
        for (int j = 0; j < n; j++) {
            if (matrix[0][j] == 0) {
                firstRow = true;
            }
        }

        // Check first column
        for (int i = 0; i < m; i++) {
            if (matrix[i][0] == 0) {
                firstCol = true;
            }
        }

        // Mark rows and columns
        for (int i = 1; i < m; i++) {
            for (int j = 1; j < n; j++) {

                if (matrix[i][j] == 0) {
                    matrix[i][0] = 0;
                    matrix[0][j] = 0;
                }
            }
        }

        // Set marked rows to zero
        for (int i = 1; i < m; i++) {

            if (matrix[i][0] == 0) {
                for (int j = 1; j < n; j++) {
                    matrix[i][j] = 0;
                }
            }
        }

        // Set marked columns to zero
        for (int j = 1; j < n; j++) {

            if (matrix[0][j] == 0) {
                for (int i = 1; i < m; i++) {
                    matrix[i][j] = 0;
                }
            }
        }

        // Set first row
        if (firstRow) {
            for (int j = 0; j < n; j++) {
                matrix[0][j] = 0;
            }
        }

        // Set first column
        if (firstCol) {
            for (int i = 0; i < m; i++) {
                matrix[i][0] = 0;
            }
        }
    }
}
