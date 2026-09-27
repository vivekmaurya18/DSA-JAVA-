
// =========================>Brute Approach<===============================
/* 

public class rotateMatrixBy90Degree {
    public static int[][] rotateMatrixBy90Degree(int[][] matrix){

        int n=matrix.length;

        int[][] ans=new int[n][n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                ans[j][n-1-i]=matrix[i][j];
                
            } 
        }
        return ans;
    }
    public static void main(String[] args) {
        int[][] matrix={
            {1,2,3},
            {4,5,6},
            {7,8,9}

        };
        int[][] result=rotateMatrixBy90Degree(matrix);

        for (int i = 0; i < result.length; i++) {
            for (int j = 0; j < result[i].length; j++) {
                System.out.print(result[i][j] + " ");
            }
            System.out.println();
        }
    }
    
}

*/

class rotateMatrixBy90Degree{
    public static  void rotateMatrixBy90Degree(int[][] matrix){

        int n=matrix.length;

        for (int i = 0; i < n-1; i++) {
            for (int j = i+1; j < n; j++) {
                int temp=matrix[i][j];
                matrix[i][j]=matrix[j][i];
                matrix[j][i]=temp;
                
            } 
        }
        for (int i = 0; i < n; i++) {
            int left = 0;
            int right = n - 1;

            while (left < right) {
                int temp = matrix[i][left];
                matrix[i][left] = matrix[i][right];
                matrix[i][right] = temp;

                left++;
                right--;
            }
        }
    }
    public static void main(String[] args) {
        int[][] matrix={
            {1,2,3},
            {4,5,6},
            {7,8,9}

        };
        rotateMatrixBy90Degree(matrix);

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
    
}