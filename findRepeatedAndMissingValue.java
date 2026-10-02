import java.util.Arrays;

class findRepeatedAndMissingValue {
    public static int[] findMissingAndRepeatedValues(int[][] grid) {

        int n = grid.length;
        long N = (long) n * n;

        // Expected sum: 1 + 2 + ... + N
        long expectedSum = N * (N + 1) / 2;

        // Expected square sum: 1² + 2² + ... + N²
        long expectedSquareSum = N * (N + 1) * (2 * N + 1) / 6;

        long actualSum = 0;
        long actualSquareSum = 0;

        // Calculate actual sum and square sum
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {

                long value = grid[i][j];

                actualSum += value;
                actualSquareSum += value * value;
            }
        }

        // actualSum - expectedSum = a - b
        long diff = actualSum - expectedSum;

        // actualSquareSum - expectedSquareSum = a² - b²
        long squareDiff = actualSquareSum - expectedSquareSum;

        // a² - b² = (a-b)(a+b)
        long sum = squareDiff / diff;

        // a + b = sum
        long repeating = (diff + sum) / 2;
        long missing = sum - repeating;

        return new int[] {
            (int) repeating,
            (int) missing
        };
    }
    public static void main(String[] args) {

        int[][] grid={
            {1,3},
            {2,2}
        };

        int[] ans=findMissingAndRepeatedValues(grid);

        System.out.println(Arrays.toString(ans));
    }
}