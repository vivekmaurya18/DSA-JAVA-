public class RopeCuttingProblem {

    public static int maxPieces(int n, int a, int b, int c) {

        if (n == 0) {
            return 0;
        }

        if (n < 0) {
            return -1;
        }

        int result = Math.max(
                Math.max(
                        maxPieces(n - a, a, b, c),
                        maxPieces(n - b, a, b, c)
                ),
                maxPieces(n - c, a, b, c)
        );

        if (result == -1) {
            return -1;
        }

        return result + 1;
    }

    public static void main(String[] args) {

        int n = 23, a = 11, b = 9, c = 12;

        System.out.println(maxPieces(n, a, b, c));
    }
}