import java.util.Scanner;
public class TwoSum {
    public static int[] twoSum(int[] nums, int target) {

        for(int i = 0; i < nums.length; i++) {
            for(int j = i + 1; j < nums.length; j++) {

                if(nums[i] + nums[j] == target){
                    int[] result={i, j};
                    return result;
                }
            }
        }

        int[] result={-1, -1};
        return result;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter the Size of Array");
        int n=sc.nextInt();
        int[] nums=new int[n];

        System.err.println("Enter Array Elements");
        for (int i = 0; i < n; i++) {
            nums[i]=sc.nextInt();
        }
        int target = 9;

        int[] result = twoSum(nums, target);

        System.out.println("[" + result[0] + "," + result[1] + "]");
    }
}