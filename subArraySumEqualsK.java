import java.util.HashMap;

public class subArraySumEqualsK {
    public static int subarraySum(int[] nums, int k) { 
 
        HashMap<Integer, Integer> map = new HashMap<>(); 
 
        map.put(0, 1); 
 
        int prefixSum = 0; 
        int count = 0; 
 
        for (int i = 0; i < nums.length; i++) { 
 
            prefixSum += nums[i]; 
 
            int required = prefixSum - k; 
 
            count += map.getOrDefault(required, 0); 
 
            map.put(prefixSum, map.getOrDefault(prefixSum, 0) + 1); 
        } 
 
        return count; 
    }
    public static void main(String[] args) {
        int[] nums={1,2,3,-3,1,1,1,4,2,-3};

        int k=3;

        int result=subarraySum(nums,k);

        System.out.println(result);
    }
}
