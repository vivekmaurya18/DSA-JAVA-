public class SingleNumber {

    public static int singleNumber(int[] arr) {

        for (int i = 0; i < arr.length; i++) {

            int nums = arr[i];
            int count = 0;

            for (int j = 0; j < arr.length; j++) {

                if (arr[j] == nums) {
                    count++;
                }
            }

            if (count == 1) {
                return nums;
            }
        }

        return -1;
    }

    public static void main(String[] args) {

        int[] arr = {1, 1, 2, 3, 3, 4, 4};

        int result = singleNumber(arr);

        System.out.println(result);
    }
}